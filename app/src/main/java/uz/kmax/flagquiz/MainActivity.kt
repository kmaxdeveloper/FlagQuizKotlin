package uz.kmax.flagquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.kmax.base.fragmentcontroller.FragmentController
import uz.kmax.flagquiz.fragment.SplashFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentController.init(R.id.container, supportFragmentManager)
        FragmentController.controller?.startMainFragment(SplashFragment())
    }
}