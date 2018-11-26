package com.example.hp.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val rup = intent.extras.getParcelable(MainActivity.KEY) as Student
        textName.text = "ID: ${rup.id}"
        textfirst.text = "First Name : ${rup.firsetname}"
        textlast.text = "Last name : ${rup.Lastname}"
    }
}
