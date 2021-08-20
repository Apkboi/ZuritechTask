package com.victor.zuritechtask2

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity

class SplahScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah_screen)


        val timer = object : CountDownTimer(3000, 40) {
            override fun onTick(l: Long) {}
            override fun onFinish() {
                startActivity(Intent(this@SplahScreenActivity, MainActivity::class.java))
                finish()
            }
        }.start()


    }
}