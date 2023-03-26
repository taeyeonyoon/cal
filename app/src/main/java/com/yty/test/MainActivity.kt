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
            new = new + "1"
            result.setText(new)
        }

        two.setOnClickListener{
            new = new + "2"
            result.setText(new)
        }

        three.setOnClickListener{
            new = new + "3"
            result.setText(new)
        }

        four.setOnClickListener{
            new = new + "4"
            result.setText(new)
        }

        five.setOnClickListener{
            new = new + "5"
            result.setText(new)
        }

        six.setOnClickListener{
            new = new + "6"
            result.setText(new)
        }

        seven.setOnClickListener{
            new = new + "7"
            result.setText(new)
        }

        eight.setOnClickListener{
            new = new + "8"
            result.setText(new)
        }

        nine.setOnClickListener{
            new = new + "9"
            result.setText(new)
        }

        zero.setOnClickListener{
            new = new + "0"
            result.setText(new)
        }


        ca.setOnClickListener {
            new = "0"
            old = "0"
            result.setText("0")
        }
        minus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)
        }
        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)

        }
        cal.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)

        }
    }
}