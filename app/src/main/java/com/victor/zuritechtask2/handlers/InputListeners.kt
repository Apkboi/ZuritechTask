package com.zubisoft.birthanddeathreg.handlers

import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import com.google.android.material.textfield.TextInputLayout

class InputListener(private val inputLayout: TextInputLayout) : TextWatcher {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

    }
    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        if (!TextUtils.isEmpty(s)) {
            inputLayout.error = null
        }else{
           inputLayout.error = "This Field must not be empty"
        }
    }

    override fun afterTextChanged(s: Editable) {}
}