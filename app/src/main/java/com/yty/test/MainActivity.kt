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
        var ytynew = "0"
        var ytyold = "0"



        one.setOnClickListener{
            ytynew = "1"
            result.text = ytynew
        }

        two.setOnClickListener{
            ytynew = "2"
            result.text = ytynew
        }

        three.setOnClickListener{
            ytynew = "3"
            result.text = ytynew
        }

        four.setOnClickListener{
            ytynew = "4"
            result.text = ytynew
        }

        five.setOnClickListener{
            ytynew = "5"
            result.text = ytynew
        }

        six.setOnClickListener{
            ytynew = "6"
            result.text = ytynew
        }

        seven.setOnClickListener{
            ytynew = "7"
            result.text = ytynew
        }

        eight.setOnClickListener{
            ytynew = "8"
            result.text = ytynew
        }

        nine.setOnClickListener{
            ytynew = "9"
            result.text = ytynew
        }

        zero.setOnClickListener{
            ytynew = "0"
            result.text = ytynew
        }


        ca.setOnClickListener {
            ytynew = "0"
            ytyold = "0"
            result.text = "0"
        }
        minus.setOnClickListener {
            ytyold = (ytyold.toInt() - ytynew.toInt()).toString()
            result.text = ytyold
        }
        plus.setOnClickListener {
            ytyold = (ytyold.toInt() + ytynew.toInt()).toString()
            result.text = ytyold
        }
        cal.setOnClickListener {
            ytyold = (ytyold.toInt() + ytynew.toInt()).toString()
            result.text = ytyold
        }
    }
}