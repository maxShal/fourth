package com.example.fourth

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rootLayOut: ConstraintLayout = findViewById(R.id.main)
        val red_color: Button = findViewById(R.id.button_red)
        val yellow_color: Button = findViewById(R.id.button_yellow)
        val green_color: Button = findViewById(R.id.button_green)
        val textView: TextView = findViewById(R.id.textView)

        red_color.setOnClickListener{
                textView.text = "Красный"
                rootLayOut.setBackgroundColor(resources.getColor(R.color.red, null))
        }

        yellow_color.setOnClickListener{
            textView.text = "Жёлтый"
            rootLayOut.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }

        green_color.setOnClickListener{
            textView.text = "Зелёный"
            rootLayOut.setBackgroundColor(resources.getColor(R.color.green, null))
        }
    }
}