package uz.kmax.flagquiz.fragment

import android.util.Log
import android.widget.Toast
import androidx.core.view.setPadding
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.databinding.MenuFragmentBinding
import uz.kmax.flagquiz.fragment.levels.*
import uz.kmax.flagquiz.utils.SharedPref

class MenuFragment : BaseFragment<MenuFragmentBinding>(MenuFragmentBinding::inflate) {
    private val shared by lazy { SharedPref(requireContext()) }
    override fun onViewCreate() {

        loadView()
        binding.asian.setOnClickListener {
            if (shared.getLevel() >= 1) {
                replaceFragment(AsianFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }

        binding.europa.setOnClickListener {
            if (shared.getLevel() >= 2) {
                replaceFragment(EuropaFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }

        binding.africa.setOnClickListener {
            if (shared.getLevel() >= 3) {
                replaceFragment(AfricaFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }

        binding.NAmerica.setOnClickListener {
            if (shared.getLevel() >= 4) {
                replaceFragment(AmericaNFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }

        binding.SAmerica.setOnClickListener {
            if (shared.getLevel() >= 5) {
                replaceFragment(AmericaSFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }
        binding.oceania.setOnClickListener {
            if (shared.getLevel() >= 6) {
                replaceFragment(OceaniaFragment())
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
                Log.d("Test","Please Play Game")
            }
        }
    }

    private fun loadView() {
        val arrayLevel = arrayOf(
            R.drawable.asian,
            R.drawable.europa,
            R.drawable.africa,
            R.drawable.namerica,
            R.drawable.samerica,
            R.drawable.oceania
        )
        val arrayLevels = arrayOf(
            binding.asian,
            binding.europa,
            binding.africa,
            binding.NAmerica,
            binding.SAmerica,
            binding.oceania
        )

        for (i in arrayLevels.indices) {
            if (i + 1 > shared.getLevel()) {
                arrayLevels[i].setImageResource(R.drawable.lock)
                arrayLevels[i].setPadding(120)
                arrayLevels[i].isClickable = false
            } else if (shared.getLevel() == 1) {
                arrayLevels[i].setImageResource(arrayLevel[i])
            } else {
                arrayLevels[i].setImageResource(arrayLevel[i])
            }
        }
    }
}