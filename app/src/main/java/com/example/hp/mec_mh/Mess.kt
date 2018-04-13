package com.example.hp.mec_mh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mess : AppCompatActivity() {

    lateinit var back2:Button
    lateinit var applied:Button
    lateinit var approved:Button
    lateinit var rejected:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess)
        back2 = findViewById(R.id.BACK2)
        back2.setOnClickListener({
            this.finish()
        })

        applied = findViewById(R.id.appliedBtn)
        applied.setOnClickListener({
            var intent:Intent
            intent = Intent(this, Result::class.java)
            intent.putExtra("state", 1)
            startActivity(intent);
        })

        approved = findViewById(R.id.ApprovedBtn1)
        approved.setOnClickListener({
            var intent:Intent
            intent = Intent(this, Result::class.java)
            intent.putExtra("state", 2)
            startActivity(intent);
        })

        rejected = findViewById(R.id.RejectedBtn1)
        rejected.setOnClickListener({
            var intent:Intent
            intent = Intent(this, Result::class.java)
            intent.putExtra("state", 3)
            startActivity(intent);
        })
    }

}
