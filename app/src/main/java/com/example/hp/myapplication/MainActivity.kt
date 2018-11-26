package com.example.hp.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   companion object {
       val KEY = "keydatastudent";
   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsend.setOnClickListener{
            val i = Intent(this,SecondActivity::class.java)

            val dataStudent = Student(
                    etID.text.toString(),
                    etfirst.text.toString(),
                    etLast.text.toString()

            )
            i.putExtra(KEY,dataStudent)
            startActivity(i)
        }
    }
}
