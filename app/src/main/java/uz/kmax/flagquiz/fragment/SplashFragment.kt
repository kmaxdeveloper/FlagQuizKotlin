package uz.kmax.flagquiz.fragment

import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import uz.kmax.flagquiz.databinding.SplashFragmentBinding

class SplashFragment : BaseFragment<SplashFragmentBinding>(SplashFragmentBinding::inflate) {
    override fun onViewCreate() {
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