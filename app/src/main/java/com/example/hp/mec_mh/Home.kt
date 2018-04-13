package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home : AppCompatActivity() {


    lateinit var messbutton:Button
    lateinit var profilebutton:Button
    lateinit var contactbutton:Button
    lateinit var logoutbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        messbutton = findViewById(R.id.Messl)
        profilebutton = findViewById(R.id.Profilel)
        contactbutton = findViewById(R.id.Contactsl)
        logoutbutton = findViewById(R.id.logout)

        messbutton.setOnClickListener({
            var inte:Intent
            inte = Intent(this, Mess::class.java)
            startActivity(inte);
        })
        profilebutton.setOnClickListener({
            var inte:Intent
            inte = Intent(this, Profile::class.java)
            startActivity(inte);
        })
        contactbutton.setOnClickListener({
            var inte:Intent
            inte = Intent(this, Contacts::class.java)
            startActivity(inte);
        })
        logoutbutton.setOnClickListener({
            this.finish()
        })
}
}
