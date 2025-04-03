package com.example.my_assig_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// getting Id of button and editText, and store them in variables
        val input_btn = findViewById<Button>(R.id.submit_btn)
        val reset_btn = findViewById<Button>(R.id.reset_btn)
        val input_txt = findViewById<EditText>(R.id.input_text)
        val display_txt = findViewById<TextView>(R.id.display_text)
// give conditions to the buttons and plain text in morusing if statement
        input_btn?.setOnClickListener {
            val time = input_txt.text.toString()

            if(time == "morning"){
                display_txt.text =  "makemba"
            }else if (time == "mid-morning"){
                display_txt.text =  "potatoes"
            }else if (time == "afternoon"){
                display_txt.text =  "madesu na loso"
            }else if (time == "mid-afternoon"){
                display_txt.text =  "pondu"
            }else if (time == "dinner"){
                display_txt.text =  "soso"
            }else if (time.isEmpty()) {
//                display_txt.text =  "FOOD IS GOOD"
                Toast.makeText(
                   this@MainActivity , "Please write something" , Toast.LENGTH_LONG).show()
            }
            else{
                display_txt.text =  "no options found"
            }
        }
//            display_txt.text = when (time) {
//                "morning" -> "makemba"
//                "mid-morning" -> "potatoes"
//                "afternoon" -> "madesu na loso"
//                "mid-afternoon" -> "pondu"
//                "dinner" -> "soso"
//                "" -> {
//                    Toast.makeText(this@MainActivity , "Please write something" , Toast.LENGTH_LONG)
//                        .show()
//                    "" // Return an empty string or handle as needed
//                }
//
//                else -> "no options found"
//            }
// clear all the the input text and display text with the reset button
            reset_btn?.setOnClickListener {
                display_txt.text = ""
                input_txt.text.clear()
            }


        }
    }
