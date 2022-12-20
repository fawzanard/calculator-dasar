package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                val sum = no1+no2

                Toast.makeText(this,"The Sum is $sum",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Please Fill all the Required Blanks.",Toast.LENGTH_LONG).show()
            }
        }

    }
}