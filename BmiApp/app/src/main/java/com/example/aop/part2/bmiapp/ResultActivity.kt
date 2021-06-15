package com.example.aop.part2.bmiapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val weight = intent.getIntExtra("weight", 0)
        val height = intent.getIntExtra("height", 0)
        val bmi = weight / (height / 100.0).pow(2.0)
        Log.d("오류1111" ,"$weight $height $bmi ")


        val resultText = when {
            bmi >= 35.0 -> "고도 비만"
            bmi >= 30.0 -> "중정도 비만"
            bmi >= 25.0 -> "경도 비만"
            bmi >= 23.0 -> "과체중"
            bmi >= 18.0 -> "정상체중"
            else -> "저체중"
        }
        val bmiResultTextView = findViewById<TextView>(R.id.bmiResultTextView)
        val resultStringTextView = findViewById<TextView>(R.id.resultStringTextView)
        bmiResultTextView.text = bmi.toString()
        resultStringTextView.text = resultText
        Log.d("오류" ,"$bmi $resultText")
    }
}