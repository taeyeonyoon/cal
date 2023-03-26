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
        var new = "0"
        var old = "0"



        one.setOnClickListener{
            new = "1"
            result.text = new
        }

        two.setOnClickListener{
            new = "2"
            result.text = new
        }

        three.setOnClickListener{
            new = "3"
            result.text = new
        }

        four.setOnClickListener{
            new = "4"
            result.text = new
        }

        five.setOnClickListener{
            new = "5"
            result.text = new
        }

        six.setOnClickListener{
            new = "6"
            result.text = new
        }

        seven.setOnClickListener{
            new = "7"
            result.text = new
        }

        eight.setOnClickListener{
            new = "8"
            result.text = new
        }

        nine.setOnClickListener{
            new = "9"
            result.text = new
        }

        zero.setOnClickListener{
            new = "0"
            result.text = new
        }


        ca.setOnClickListener {
            new = "0"
            old = "0"
            result.text = "0"
        }
        minus.setOnClickListener {
            old = (old.toInt() - new.toInt()).toString()
            result.text = old
        }
        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            result.text = old
        }
        cal.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            result.text = old
        }
    }
}