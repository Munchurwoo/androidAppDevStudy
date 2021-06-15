package com.example.aop.part2.chapter01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val heightEditTest:EditText = findViewById(R.id.heightEditTest);
        val weightEditTest = findViewById<EditText>(R.id.weightEditTest);
        val resultButton = findViewById<Button>(R.id.resultButton);


        resultButton.setOnClickListener {
            Log.d("MainActivity","resultButton 이 클릭 되었습니다." );
            if(heightEditTest.text.isEmpty() || weightEditTest.text.isEmpty()){
                Toast.makeText(this,"빈 값을 입력했습니다",Toast.LENGTH_LONG).show();

                return@setOnClickListener
            }  
            //이 아래로는 빈값이 절대 없다.
            val height:Int = heightEditTest.text.toString().toInt()
            val weight:Int = weightEditTest.text.toString().toInt()
            Log.d("MainActivity","height $height weight $weight" );
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)

        }
    }
}