package uz.kmax.flagquiz.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.databinding.DialogEnterBinding

class DialogAmericaN {

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

        binding.dialogText.setText(R.string.dialog_namerica_text)
        binding.dialogImage.setImageResource(R.drawable.dialog_namerica_image)

        binding.dialogClose.setOnClickListener {
            onDialogClickListener?.invoke()
            dialog.dismiss()
        }

        binding.dialogContinue.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}