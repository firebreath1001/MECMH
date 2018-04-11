package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var log_in: Button
    lateinit var username: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log_in = findViewById(R.id.Login)
        username = findViewById(R.id.USRN2)
        password = findViewById(R.id.password)
        log_in.setOnClickListener(View.OnClickListener {
            if(username.getText().toString()== "ajesh" && password.getText().toString() == "password"){
                var inte: Intent
                inte = Intent(this, Home::class.java)
                startActivity(inte)
            }
        })
    }
}
