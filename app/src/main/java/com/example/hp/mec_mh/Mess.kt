package com.example.hp.mec_mh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button

class Mess : AppCompatActivity() {

    lateinit var log_in:Button
    lateinit var back2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess)
        back2 = findViewById(R.id.BACK2)
        back2.setOnClickListener({
            this.finish()
        })
    }

}
