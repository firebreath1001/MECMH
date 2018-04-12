package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class ProfileEntry : AppCompatActivity() {

    lateinit var name2:EditText
    lateinit var emailid:EditText
    lateinit var mob:EditText
    lateinit var add:EditText
    lateinit var dob:EditText
    lateinit var back6:Button
    lateinit var upload1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_entry)
        back6 = findViewById(R.id.BACK6)
        back6.setOnClickListener({
            this.finish()
        })
        name2 = findViewById(R.id.Name2)
        emailid = findViewById(R.id.EmailID)
        mob = findViewById(R.id.MobNo2)
        add = findViewById(R.id.Address2)
        dob = findViewById(R.id.DOB2)
        upload1 = findViewById(R.id.Upload1)
        upload1.setOnClickListener({
            var intent:Intent
            intent = Intent(this, Result::class.java)
            intent.putExtra("state", 5)
            intent.putExtra("name", name2.text.toString())
            intent.putExtra("email", emailid.getText().toString())
            intent.putExtra("mob", mob.text.toString())
            intent.putExtra("add", add.text.toString())
            intent.putExtra("dob", dob.text.toString())
            startActivity(intent)
        })
    }
}
