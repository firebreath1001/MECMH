package com.example.hp.mec_mh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {

    lateinit var backto:Button
    lateinit var title:TextView
    lateinit var date:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = findViewById(R.id.resultHead)
        date = findViewById(R.id.DATA2)

        var st:Int
        st = getIntent().getExtras().getInt("state")

        if(st == 1) {

            title.setText("Applied Mess Cuts")

            var dates = arrayOf("17/02/2018", "18/02/2018", "19/02/2018", "20/02/2018")
            for (i in 0..3) {
                date.setText(date.getText().toString() + "\n" + dates[i])
            }
        }


        else if(st == 2) {

            title.setText("Approved Mess Cuts")

            var dates = arrayOf("21/02/2018", "22/02/2018", "23/02/2018", "24/02/2018")
            for (i in 0..3) {
                date.setText(date.getText().toString() + "\n" + dates[i])
            }
        }


        else if(st == 3) {

            title.setText("Rejected Mess Cuts")

            var dates = arrayOf("25/02/2018", "26/02/2018", "27/02/2018", "28/02/2018")
            for (i in 0..3) {
                date.setText(date.getText().toString() + "\n" + dates[i])
            }
        }

        else if(st == 4) {

            title.setText("Sign Up details")

            var adm = getIntent().getExtras().getString("adm")
            var email = getIntent().getExtras().getString("email")
            var pass = getIntent().getExtras().getString("pass")
            var pass2 = getIntent().getExtras().getString("pass2")
            date.setText(adm+"\n"+email+"\n"+pass+"\n"+pass2)
        }

        else if(st == 5) {

            title.setText("Sign Up details")

            var name = getIntent().getExtras().getString("name")
            var email = getIntent().getExtras().getString("email")
            var mob = getIntent().getExtras().getString("mob")
            var add = getIntent().getExtras().getString("add")
            var dob = getIntent().getExtras().getString("dob")
            date.setText(name+"\n"+email+"\n"+mob+"\n"+add+"\n"+dob)
        }


        backto = findViewById(R.id.BACK8)
        backto.setOnClickListener({
            this.finish()
        })
    }
}
