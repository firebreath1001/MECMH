package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Profile : AppCompatActivity() {

    lateinit var back4: Button
    lateinit var edit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        back4 = findViewById(R.id.BACK4)
        back4.setOnClickListener(View.OnClickListener {
            this.finish()
        })

        edit = findViewById(R.id.EditButton)
        edit.setOnClickListener({
            var intent:Intent
            intent = Intent(this, ProfileEntry::class.java)
            startActivity(intent)
        })
    }
}
