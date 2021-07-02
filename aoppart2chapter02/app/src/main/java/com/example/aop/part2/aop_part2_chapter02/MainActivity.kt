package com.example.aop.part2.aop_part2_chapter02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker

class MainActivity : AppCompatActivity() {

    private val addButton : Button by lazy {
        findViewById<Button>(R.id.addButton)
    }
    private val clearButton : Button by lazy{
        findViewById<Button>(R.id.clearButton)
    }
    private val runButton : Button by lazy{
        findViewById<Button>(R.id.runButton)
    }
    private val numberPicker : NumberPicker by lazy{
        findViewById<NumberPicker>(R.id.numberPicker)
        //c12
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}