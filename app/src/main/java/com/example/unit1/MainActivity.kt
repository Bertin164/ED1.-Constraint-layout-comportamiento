package com.example.unit1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var box_one_text: TextView
    private lateinit var box_two_text: TextView
    private lateinit var box_three_text: TextView
    private lateinit var box_four_text: TextView
    private lateinit var box_five_text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text = findViewById(R.id.box_one_text)
        box_two_text = findViewById(R.id.box_two_text)
        box_three_text = findViewById(R.id.box_three_text)
        box_four_text = findViewById(R.id.box_four_text)
        box_five_text = findViewById(R.id.box_five_text)
    }

    fun changeColor(view: View){
        val color: Int = when (view.id){
            R.id.btn_red        -> Color.RED
            R.id.btn_yellow     -> Color.rgb(255,223,0)
            R.id.btn_green      -> Color.GREEN
            R.id.box_one_text   -> Color.BLACK
            R.id.box_two_text   -> Color.GRAY
            R.id.box_three_text -> Color.rgb(153,204,0)
            R.id.box_four_text  -> Color.rgb(102,153,0)
            R.id.box_five_text  -> Color.rgb(153,204,0)
            else -> Color.WHITE
        }
        when (view.id){
            R.id.btn_red        -> box_three_text.setBackgroundColor(color)
            R.id.btn_yellow     -> box_four_text.setBackgroundColor(color)
            R.id.btn_green      -> box_five_text.setBackgroundColor(color)
            R.id.box_one_text   -> box_one_text.setBackgroundColor(color)
            R.id.box_two_text   -> box_two_text.setBackgroundColor(color)
            R.id.box_three_text -> box_three_text.setBackgroundColor(color)
            R.id.box_four_text  -> box_four_text.setBackgroundColor(color)
            R.id.box_five_text  -> box_five_text.setBackgroundColor(color)


        }
    }
}