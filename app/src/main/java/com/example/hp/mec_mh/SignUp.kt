package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {

    lateinit var back8:Button
    lateinit var upload:Button
    lateinit var adm:EditText
    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var pass2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        back8=findViewById(R.id.BACK8)
        back8.setOnClickListener({
            this.finish()
        })

        upload = findViewById(R.id.upload)
        upload.setOnClickListener({
            var intent:Intent
            intent = Intent(this, Result::class.java)
            intent.putExtra("state", 4)
            adm = findViewById(R.id.ADMN)
            email = findViewById(R.id.EmailID)
            pass = findViewById(R.id.password3)
            pass2 = findViewById(R.id.password4)

            intent.putExtra("adm", adm.getText().toString())
            intent.putExtra("email", email.getText().toString())
            intent.putExtra("pass", pass.getText().toString())
            intent.putExtra("pass2", pass2.getText().toString())
            startActivity(intent)
        })
    }
}
