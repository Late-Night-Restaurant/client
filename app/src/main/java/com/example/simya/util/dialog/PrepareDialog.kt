package com.example.simya.util.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.example.simya.databinding.DialogDefaultBinding
import com.example.simya.databinding.DialogPrepareBinding
import com.example.simya.util.onThrottleClick

class PrepareDialog(context: Context,prepareDialogInterface: PrepareDialogInterface): Dialog(context){
    private var mBinding: DialogPrepareBinding? = null
    private val binding get() = mBinding!!

    private var prepareDialogInterface: PrepareDialogInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mBinding = DialogPrepareBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window!!.setBackgroundDrawable(ColorDrawable())
        window!!.setDimAmount(0.2f)
        binding.btnOk.onThrottleClick {
            this.prepareDialogInterface?.onOKClicked()
            this.dismiss()
        }
    }
}