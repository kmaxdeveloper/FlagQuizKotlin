package uz.kmax.flagquiz.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.databinding.DialogEnterBinding

class LevelDialog(var levelType : Int) {

    private var onDialogClickListener: (() -> Unit)? = null

    fun setOnDialogClickListener(listener: () -> Unit) {
        onDialogClickListener = listener
    }

    fun show(context: Context){
        val dialog = Dialog(context)
        val binding = DialogEnterBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCancelable(false)

        binding.dialogText.setText(getDialogTextLevel(levelType))
        binding.dialogImage.setImageResource(getDialogImageLevel(levelType))

        binding.dialogClose.setOnClickListener {
            onDialogClickListener?.invoke()
            dialog.dismiss()
        }

        binding.dialogContinue.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun getDialogTextLevel(type : Int):Int{

        when(type){
            1->{ return R.string.dialog_asian_text}
            2->{ return R.string.dialog_europa_text}
            3->{ return R.string.dialog_africa_text}
            4->{ return R.string.dialog_namerica_text}
            5->{ return R.string.dialog_samerica_text}
            6->{ return R.string.dialog_oceania_text}
        }

        return 1
    }
    private fun getDialogImageLevel(type : Int):Int{

        when(type){
            1->{ return R.drawable.dialog_asian_image}
            2->{ return R.drawable.dialog_europa_image}
            3->{ return R.drawable.dialog_africa_image}
            4->{ return R.drawable.dialog_namerica_image}
            5->{ return R.drawable.dialog_samerica_image}
            6->{ return R.drawable.dialog_oceania_image}
        }

        return 1
    }
}