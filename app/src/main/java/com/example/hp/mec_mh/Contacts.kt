package com.example.hp.mec_mh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contacts : AppCompatActivity() {

    lateinit var back5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        back5 = findViewById(R.id.BACK5)
        back5.setOnClickListener({
            this.finish()
        })
    }
}
