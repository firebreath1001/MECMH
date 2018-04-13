package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {

    lateinit var back4: Button
    lateinit var edit: Button
    lateinit var name:TextView
    lateinit var email: TextView
    lateinit var mob:TextView
    lateinit var add:TextView
    lateinit var dob:TextView
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
        var ar = arrayOf("Ajesh Kumar S", "ajeshkkumar36020@gmail.com", "9074249658", "My address", "07/05/1998")
        name = findViewById(R.id.NameField)
        email = findViewById(R.id.EmailField)
        mob = findViewById(R.id.MobNoField)
        add = findViewById(R.id.AddressField)
        dob = findViewById(R.id.DOBField)
        name.setText(ar[0])
        email.setText(ar[1])
        mob.setText(ar[2])
        add.setText(ar[3])
        dob.setText(ar[4])
    }
}
