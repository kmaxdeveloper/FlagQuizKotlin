package uz.kmax.flagquiz.fragment

import android.widget.Toast
import androidx.core.view.setPadding
import uz.kmax.base.basefragment.BaseFragmentWC
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.databinding.MenuFragmentBinding
import uz.kmax.flagquiz.tools.other.SharedPref

class MenuFragment : BaseFragmentWC<MenuFragmentBinding>(MenuFragmentBinding::inflate) {
    private val shared by lazy { SharedPref(requireContext()) }

    override fun onViewCreated() {
        loadView()
        binding.asian.setOnClickListener {
            if (shared.getLevel() >= 1) {
                replaceFragment(GameFragment(1))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
            }
        }

        binding.europa.setOnClickListener {
            if (shared.getLevel() >= 2) {
                replaceFragment(GameFragment(2))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
            }
        }

        binding.africa.setOnClickListener {
            if (shared.getLevel() >= 3) {
                replaceFragment(GameFragment(3))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
            }
        }

        binding.NAmerica.setOnClickListener {
            if (shared.getLevel() >= 4) {
                replaceFragment(GameFragment(4))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
            }
        }

        binding.SAmerica.setOnClickListener {
            if (shared.getLevel() >= 5) {
                replaceFragment(GameFragment(5))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
            }
        }
        binding.oceania.setOnClickListener {
            if (shared.getLevel() >= 6) {
                replaceFragment(GameFragment(6))
            } else {
                Toast.makeText(requireContext(), "Please Play ", Toast.LENGTH_SHORT).show()
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