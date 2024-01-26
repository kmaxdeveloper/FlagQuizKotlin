package uz.kmax.flagquiz.fragment

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.widget.Toast
import androidx.core.view.get
import uz.kmax.base.basefragment.BaseFragmentWC
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.data.GameData
import uz.kmax.flagquiz.databinding.GameFragmentBinding
import uz.kmax.flagquiz.dialog.LevelDialog
import uz.kmax.flagquiz.dialog.WinDialog
import uz.kmax.flagquiz.tools.manager.AdsManager
import uz.kmax.flagquiz.tools.manager.GameManager
import uz.kmax.flagquiz.tools.other.SharedPref
import java.util.Random

class GameFragment(private var gameType : Int) : BaseFragmentWC<GameFragmentBinding>(GameFragmentBinding::inflate){
    private val shared by lazy { SharedPref(requireContext()) }
    private val gameManager by lazy { GameManager() }
    private var gameList = ArrayList<GameData>()
    private val dialog = LevelDialog(gameType)
    private val endDialog = WinDialog()
    private var adsManager = AdsManager()
    private var adsStatus = false
    private var numLeft = 0
    private var numRight = 0
    private var count = 0
    private var random = Random()

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated() {
        adsManager.initialize(requireContext())
        binding.textLevels.setText(gameManager.getLevelText(gameType))
        gameList.addAll(gameManager.getData(gameType))
        binding.imgLeft.clipToOutline = true
        binding.imgRight.clipToOutline = true
        dialog.show(requireContext())
        dialog.setOnDialogClickListener {
            back()
        }
        binding.buttonBack.setOnClickListener {
            ads()
        }
        levelProgress()

        binding.imgLeft.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                binding.imgRight.isClickable = false
                if (gameList[numLeft].trueAndFalse < gameList[numRight].trueAndFalse) {
                    binding.imgLeft.setImageResource(R.drawable.img_true)
                } else {
                    binding.imgLeft.setImageResource(R.drawable.img_false)
                }
            } else if (event.action == MotionEvent.ACTION_UP) {
                if (gameList[numLeft].trueAndFalse < gameList[numRight].trueAndFalse) {
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
                if (gameList[numLeft].trueAndFalse > gameList[numRight].trueAndFalse) {
                    binding.imgRight.setImageResource(R.drawable.img_true)
                } else {
                    binding.imgRight.setImageResource(R.drawable.img_false)
                }
            } else if (event.action == MotionEvent.ACTION_UP) {
                if (gameList[numLeft].trueAndFalse > gameList[numRight].trueAndFalse) {
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
        numLeft = random.nextInt(gameManager.getLevelSize(gameType))
        numRight = random.nextInt(gameManager.getLevelSize(gameType))
        while (numLeft == numRight) { numRight = random.nextInt(gameManager.getLevelSize(gameType)) }
        if (numLeft % 2 == 0 && numRight % 2 == 0 || numLeft % 2 == 1 && numRight % 2 == 1) { numRight += 1 }

        binding.imgLeft.setImageResource(gameList[numLeft].image)
        binding.textLeft.setText(gameList[numLeft].name)
        binding.imgRight.setImageResource(gameList[numRight].image)
        binding.textRight.setText(gameList[numRight].name)
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
            var level = shared.getLevel()
            shared.setLevel(++level)
            endDialog.show(requireContext())
            endDialog.setOnDialogClickListener {
                ads()
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

    override fun onResume() {
        super.onResume()
        adsManager.initializeInterstitialAds(requireContext(),"ca-app-pub-4664801446868642/7374004703")

        adsManager.setOnAdsNullListener {
            adsStatus = it
        }
        // ca-app-pub-3940256099942544/1033173712 simple code
        // ca-app-pub-4664801446868642/7374004703 my code
        // ca-app-pub-4664801446868642/7374004703
    }

    private fun ads() {
        if (adsStatus) {
            adsManager.showInterstitialAds(requireActivity())
            adsManager.setOnAdsNotReadyListener {
                startMainFragment(MenuFragment())
            }
            adsManager.setOnAdDismissClickListener {
                startMainFragment(MenuFragment())
            }
            adsManager.setOnAdsClickListener {
                Toast.makeText(requireContext(), "Thanks ! for clicking ads :D", Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            startMainFragment(MenuFragment())
        }
    }
}