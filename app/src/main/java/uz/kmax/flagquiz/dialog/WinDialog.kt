package uz.kmax.flagquiz.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import uz.kmax.flagquiz.databinding.DialogEndBinding

class WinDialog {

    private var onDialogClickListener: (() -> Unit)? = null

    fun setOnDialogClickListener(listener: () -> Unit) {
        onDialogClickListener = listener
    }

    fun show(context: Context){
        val dialog = Dialog(context)
        val binding = DialogEndBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCancelable(false)

        binding.dialogEndClose.setOnClickListener {
            onDialogClickListener?.invoke()
            dialog.dismiss()
        }

        binding.dialogEndContinue.setOnClickListener {
            onDialogClickListener?.invoke()
            dialog.dismiss()
        }

        dialog.show()
    }
}