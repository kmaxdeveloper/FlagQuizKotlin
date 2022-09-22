package uz.kmax.flagquiz.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import uz.kmax.flagquiz.controller.FragmentController
import java.util.*


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: Inflate<VB>
) : Fragment() {
    private var _binding: VB? = null
    val binding get() = _binding!!
    private val controller = FragmentController.controller
    var numLeft = 0
    var numRight = 0
    var count = 0
    var random = Random()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    fun replaceFragment(Fragment: Fragment) {
        controller?.replaceFragment(Fragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewCreate()
    }

    abstract fun onViewCreate()

    fun backFragment(){
        controller?.back()
    }

    fun startMainFragment(fragment: Fragment){
        controller?.startMainFragment(fragment)
    }

}
