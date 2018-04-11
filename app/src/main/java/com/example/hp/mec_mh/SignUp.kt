package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    lateinit var back8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        back8=findViewById(R.id.BACK8)
        back8.setOnClickListener({
            this.finish()
        })
    }
}
