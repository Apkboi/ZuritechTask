package com.victor.zuritechtask2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.victor.zuritechtask2.databinding.ActivityMainBinding
import com.victor.zuritechtask2.models.UserInput
import com.zubisoft.birthanddeathreg.handlers.InputListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)
        val sexes = arrayOf("Male", "Female")


        binding.edtFirstname.addTextChangedListener(InputListener(binding.inputName))
        binding.edtEmail.addTextChangedListener(InputListener(binding.inputEmail))
        binding.edtPhoneNumber.addTextChangedListener(InputListener(binding.inputPhoneNumber))
        binding.edtUsername.addTextChangedListener(InputListener(binding.inputUsername))
//        binding.edt.addTextChangedListener(InputListener(binding.inputName))

        fun isFieldsValidated(): Boolean {
            if (binding.edtFirstname.text.toString().isEmpty()) {
                binding.inputName.setError("Please fill this field")
                return false
            } else if (binding.edtUsername.getText().toString().isEmpty()) {
                binding.inputUsername.setError("Please fill this field")
                return false
            } else if (binding.edtEmail.getText().toString().isEmpty()) {
                binding.inputEmail.setError("Please fill this field")
                return false
            } else if (binding.edtPhoneNumber.getText().toString().isEmpty()) {
                binding.inputPhoneNumber.setError("Please fill this field")
                return false
            }
//            else if (edtAddress.getText().toString().isEmpty()) {
//                inputAddress.setError("Please fill this field")
//                return false
//            }
            return true
        }


        binding.btnPreview.setOnClickListener {

            var intent = Intent(this, InputDetailsActivity::class.java)


            if (isFieldsValidated()) {

                intent.putExtra("firstName", binding.edtFirstname.text.toString())
                intent.putExtra("lastName", binding.edtLastname.text.toString())
                intent.putExtra("userName", binding.edtUsername.text.toString())
                intent.putExtra("email", binding.edtEmail.text.toString())
                intent.putExtra("phoneNumber", binding.edtPhoneNumber.text.toString())
//                intent.putExtra("details", userInput)

                startActivity(intent)

            }
        }

    }


}