package uz.kmax.flagquiz.fragment.levels

import android.annotation.SuppressLint
import android.view.MotionEvent
import androidx.core.view.get
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.databinding.GameFragmentBinding
import uz.kmax.flagquiz.dialog.DialogAmericaN
import uz.kmax.flagquiz.dialog.WinDialog
import uz.kmax.flagquiz.fragment.BaseFragment
import uz.kmax.flagquiz.manager.ArrayGame
import uz.kmax.flagquiz.utils.SharedPref

class AmericaNFragment : BaseFragment<GameFragmentBinding>(GameFragmentBinding::inflate) {
    private val array by lazy { ArrayGame() }
    private val shared by lazy { SharedPref(requireContext()) }
    private var dialog = DialogAmericaN()
    private var dialogEnd = WinDialog()
    var adType = 0
    private var mInterstitialAd: InterstitialAd? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreate() {
        binding.textLevels.setText(R.string.level_namerica)
        binding.imgLeft.clipToOutline = true
        binding.imgRight.clipToOutline = true
        binding.buttonBack.setOnClickListener {
            if (mInterstitialAd != null){
                adType = 1
                mInterstitialAd?.show(requireActivity())
            }else{
                backFragment()
            }
        }
        levelProgress()
        dialog.setOnDialogClickListener {
            backFragment()
        }

        binding.imgLeft.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                binding.imgRight.isClickable = false
                if (array.NAmericaTrueAndFalse[numLeft] < array.NAmericaTrueAndFalse[numRight]) {
                    binding.imgLeft.setImageResource(R.drawable.img_true)
                } else {
                    binding.imgLeft.setImageResource(R.drawable.img_false)
                }
            } else if (event.action == MotionEvent.ACTION_UP) {
                if (array.NAmericaTrueAndFalse[numLeft] < array.NAmericaTrueAndFalse[numRight]) {
                    gameProgress(1)
                } else {
                    gameProgress(2)
                }
                checkGame(2)
            }
            return@setOnTouchListener true
        }

        binding.imgRight.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                binding.imgRight.isClickable = false
                if (array.NAmericaTrueAndFalse[numLeft] > array.NAmericaTrueAndFalse[numRight]) {
                    binding.imgRight.setImageResource(R.drawable.img_true)
                } else {
                    binding.imgRight.setImageResource(R.drawable.img_false)
                }
            } else if (event.action == MotionEvent.ACTION_UP) {
                if (array.NAmericaTrueAndFalse[numLeft] > array.NAmericaTrueAndFalse[numRight]) {
                    gameProgress(1)
                } else {
                    gameProgress(2)
                }
                checkGame(1)
            }
            return@setOnTouchListener true
        }
    }

    private fun levelProgress(){
        numLeft = random.nextInt(34)
        numRight = random.nextInt(34)
        while (numLeft == numRight) { numRight = random.nextInt(34) }
        if (numLeft % 2 == 0 && numRight % 2 == 0 || numLeft % 2 == 1 && numRight % 2 == 1) { numRight += 1 }

        binding.imgLeft.setImageResource(array.NAmerica[numLeft])
        binding.textLeft.setText(array.NAmericaName[numLeft])
        binding.imgRight.setImageResource(array.NAmerica[numRight])
        binding.textRight.setText(array.NAmericaName[numRight])
    }

    private fun gameProgress(type : Int){
        if (type== 1){
            if (count < 20) { count += 1 }
            for (i in 0..19) {
                binding.progressParent[i].setBackgroundResource(R.drawable.style_point)
            }
        }else{
            if (count > 0) { count = if (count == 1) 0 else count - 2 }
            for (i in 0..18) {
                binding.progressParent[i].setBackgroundResource(R.drawable.style_point)
            }
        }
        for (i in 0 until count) {
            binding.progressParent[i].setBackgroundResource(R.drawable.style_point_green)
        }
    }

    private fun checkGame(type: Int){
        if (count == 20) {
            if (shared.getLevel() <= 1) {
                shared.setLevel(2)
            }
            dialogEnd.show(requireContext())
            dialogEnd.setOnDialogClickListener {
                if (mInterstitialAd != null){
                    adType = 1
                    mInterstitialAd?.show(requireActivity())
                }else{
                    backFragment()
                }
            }
        } else {
            levelProgress()
            if (type == 1){
                binding.imgLeft.isClickable = true
            }else{
                binding.imgRight.isClickable = true
            }
        }
    }

    private fun ad() {
        mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdClicked() {
                // Called when a click is recorded for an ad.
            }

            override fun onAdDismissedFullScreenContent() {
                when (adType) {
                    1 -> {
                        backFragment()
                    }
                }
                mInterstitialAd = null
            }

            override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                // Called when ad fails to show.
                mInterstitialAd = null
            }

            override fun onAdImpression() {
                // Called when an impression is recorded for an ad.
            }

            override fun onAdShowedFullScreenContent() {
                // Called when ad is shown.
            }
        }
    }

    override fun onResume() {
        super.onResume()
        // ca-app-pub-3940256099942544/1033173712 simple code
        // ca-app-pub-4664801446868642/7374004703 my code
        // ca-app-pub-4664801446868642/7374004703
        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            requireContext(),
            "ca-app-pub-3940256099942544/1033173712",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    mInterstitialAd = interstitialAd
                    ad()
                }
            })
    }
}