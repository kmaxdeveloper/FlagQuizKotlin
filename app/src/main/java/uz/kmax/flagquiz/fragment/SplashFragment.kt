package uz.kmax.flagquiz.fragment

import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import uz.kmax.base.basefragment.BaseFragmentWC
import uz.kmax.flagquiz.databinding.SplashFragmentBinding

class SplashFragment : BaseFragmentWC<SplashFragmentBinding>(SplashFragmentBinding::inflate) {

    override fun onViewCreated() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        object : CountDownTimer(5000, 100) {
            override fun onFinish() {
                startMainFragment(MenuFragment())
            }
            override fun onTick(value: Long) {

            }
        }.start()
    }
}