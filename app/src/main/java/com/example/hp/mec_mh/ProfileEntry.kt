package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ProfileEntry : AppCompatActivity() {

    lateinit var back6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_entry)
        back6 = findViewById(R.id.BACK6)
        back6.setOnClickListener({
            this.finish()
        })
    }
}
