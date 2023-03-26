package com.yty.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one : TextView = findViewById(R.id.one)
        val two : TextView = findViewById(R.id.two)
        val three  : TextView = findViewById(R.id.three)
        val four  : TextView = findViewById(R.id.four)
        val five : TextView = findViewById(R.id.five)
        val six : TextView = findViewById(R.id.six)
        val seven : TextView = findViewById(R.id.seven)
        val eight : TextView = findViewById(R.id.eight)
        val nine : TextView = findViewById(R.id.nine)
        val zero : TextView = findViewById(R.id.zero)
        val plus : TextView = findViewById(R.id.plus)
        val ca : TextView = findViewById(R.id.cancel)
        val minus : TextView = findViewById(R.id.minus)
        val result : TextView = findViewById(R.id.result)
        val cal  : TextView= findViewById(R.id.cal)
        var ytyres = "0"



        one.setOnClickListener{
            ytyres = "1"
            result.text = ytyres
        }

        two.setOnClickListener{
            ytyres = "2"
            result.text = ytyres
        }

        three.setOnClickListener{
            ytyres = "3"
            result.text = ytyres
        }

        four.setOnClickListener{
            ytyres = "4"
            result.text = ytyres
        }

        five.setOnClickListener{
            ytyres = "5"
            result.text = ytyres
        }

        six.setOnClickListener{
            ytyres = "6"
            result.text = ytyres
        }

        seven.setOnClickListener{
            ytyres = "7"
            result.text = ytyres
        }

        eight.setOnClickListener{
            ytyres = "8"
            result.text = ytyres
        }

        nine.setOnClickListener{
            ytyres = "9"
            result.text = ytyres
        }

        zero.setOnClickListener{
            ytyres = "0"
            result.text = ytyres
        }


        ca.setOnClickListener {
            ytyres = "0"
            result.text = "0"
        }
        minus.setOnClickListener {
            ytyres = (ytyold.toInt() - ytynew.toInt()).toString()
            result.text = ytyres
        }
        plus.setOnClickListener {
            ytyres = (ytyold.toInt() + ytynew.toInt()).toString()
            result.text = ytyres
        }
        cal.setOnClickListener {
            ytyres = (ytyold.toInt() + ytynew.toInt()).toString()
            result.text = ytyres
        }
    }
}