package com.victor.zuritechtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.victor.zuritechtask2.databinding.ActivityInputDetailsBinding
import com.victor.zuritechtask2.models.UserInput

class InputDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var  binding:ActivityInputDetailsBinding
        binding = ActivityInputDetailsBinding.inflate(LayoutInflater.from(this))
        val root = binding.root
        setContentView(root)

        val intent = intent
//       val details:UserInput = intent.getSerializableExtra("details")as UserInput
      binding.txtName.text = intent.getStringExtra("firstName")
        binding.txtEmail.text = intent.getStringExtra("email")
        binding.txtUsername.text =  intent.getStringExtra("userName")
        binding.txtPhoneNumber.text =  intent.getStringExtra("phoneNumber")
        binding.txtLastName.text =  intent.getStringExtra("lastName")

        binding.imgClose.setOnClickListener{
            finish()
        }
        binding.btnExit.setOnClickListener {
            finishAffinity()
        }




    }
}