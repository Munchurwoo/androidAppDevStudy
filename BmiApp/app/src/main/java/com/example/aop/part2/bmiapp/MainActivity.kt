package com.example.aop.part2.bmiapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weightEditText: EditText = findViewById(R.id.weightEditText);
        val heightEditText = findViewById<EditText>(R.id.heightEditText);
        val resultButton = findViewById<Button>(R.id.resultButton);



        resultButton.setOnClickListener {
            if (weightEditText.text.isEmpty() || heightEditText.text.isEmpty()) {
                Toast.makeText(this, "빈 값을 입력했습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener;
            }
            val weight: Int = weightEditText.text.toString().toInt()
            val height: Int = heightEditText.text.toString().toInt()

            Log.d("MainActivity", "weight : $weight height : $height resultButton : $resultButton")
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("weight",weight)
            intent.putExtra("height",height)
            startActivity(intent)
        }
    }
}