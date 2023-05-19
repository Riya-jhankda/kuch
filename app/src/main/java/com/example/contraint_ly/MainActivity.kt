package com.example.contraint_ly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.OnClickListener
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Apply_btn.setOnClickListener{
            val Fname=FirstName.text.toString()
            val Lname=LastName.text.toString()
            val DOB=BirthDate.text.toString()
            val country=CountryName.text.toString()
            Log.d("MainActivity","$Fname $Lname is born on $DOB in country $country")

        }


    }
}


