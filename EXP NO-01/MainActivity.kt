package com.example.exno_01

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

      /*  ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }*/
        val b1 = findViewById<Button>(R.id.button)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val text = findViewById<TextView>(R.id.textView)




        b1.setOnClickListener {

            text.setTextColor(Color.parseColor("#FF0000"))
            text.setTextSize(30f)

        }




        b2.setOnClickListener {
            text.setTypeface(null, android.graphics.Typeface.BOLD)
        }



            b3.setOnClickListener {
                Toast.makeText(this, "Toast message displayed", Toast.LENGTH_SHORT).show()
            }


    }


}
