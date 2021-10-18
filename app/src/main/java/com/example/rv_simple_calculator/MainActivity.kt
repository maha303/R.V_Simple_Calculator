package com.example.rv_simple_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edNum1:EditText
    private lateinit var edNum2:EditText

    private lateinit var tv:TextView

    private lateinit var btnSum:Button
    private lateinit var btnSub:Button
    private lateinit var btnM:Button
    private lateinit var btnD:Button

    var num1=0
    var num2=0
    var result=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edNum1=findViewById(R.id.edNum1)
        edNum2=findViewById(R.id.edNum2)
        tv=findViewById(R.id.tv)

        btnSum=findViewById(R.id.btnSum)
        btnSum.setOnClickListener {
            num1 = edNum1.text.toString().toInt()
            num2 = edNum2.text.toString().toInt()

            upDate()

            result= (num1+num2).toString()
            tv.text="$num1 +$num2 = $result"

        }
        btnSub=findViewById(R.id.btnSub)
        btnSub.setOnClickListener {
            num1 = edNum1.text.toString().toInt()
            num2 = edNum2.text.toString().toInt()

            upDate()

            result= (num1-num2).toString()
            tv.text="$num1 - $num2 = $result"

        }
        btnM=findViewById(R.id.btnM)
        btnM.setOnClickListener {
            num1 = edNum1.text.toString().toInt()
            num2 = edNum2.text.toString().toInt()

            upDate()

            result= (num1*num2).toString()
            tv.text="$num1 * $num2 = $result"

        }

        btnD=findViewById(R.id.btnD)
        btnD.setOnClickListener {
            num1 = edNum1.text.toString().toInt()
            num2 = edNum2.text.toString().toInt()

            upDate()

            result= (num1/num2).toString()
            tv.text="$num1 /$num2 = $result"

        }


    }
    private fun upDate(){

        edNum1.text.clear()
        edNum2.text.clear()

    }
}