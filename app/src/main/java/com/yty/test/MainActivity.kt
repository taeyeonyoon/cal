package com.yty.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textView: TextView
    private var firstNumber: Int = 0
    private var secondNumber: Int = 0
    private var operation: String = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.result)
        findViewById<TextView>(R.id.zero).setOnClickListener(this)
        findViewById<TextView>(R.id.one).setOnClickListener(this)
        findViewById<TextView>(R.id.two).setOnClickListener(this)
        findViewById<TextView>(R.id.three).setOnClickListener(this)
        findViewById<TextView>(R.id.four).setOnClickListener(this)
        findViewById<TextView>(R.id.five).setOnClickListener(this)
        findViewById<TextView>(R.id.six).setOnClickListener(this)
        findViewById<TextView>(R.id.seven).setOnClickListener(this)
        findViewById<TextView>(R.id.eight).setOnClickListener(this)
        findViewById<TextView>(R.id.nine).setOnClickListener(this)

        findViewById<TextView>(R.id.plus).setOnClickListener { operationClick("+") }
        findViewById<TextView>(R.id.minus).setOnClickListener { operationClick("-") }
        findViewById<TextView>(R.id.multi).setOnClickListener { operationClick("*") }
        findViewById<TextView>(R.id.divide).setOnClickListener { operationClick("/") }

        findViewById<TextView>(R.id.cal).setOnClickListener {
            val result = calculate()
            textView.text = result.toString()
            firstNumber = result
            secondNumber = 0
            operation = ""
        }
        findViewById<TextView>(R.id.cancel).setOnClickListener {
            textView.text = "0"
            firstNumber = 0
            secondNumber = 0
            operation = ""
        }
    }

    override fun onClick(view: View?) {
        val number = (view as TextView).text.toString().toInt()
        val text = textView.text.toString()

        textView.text = if (text == "0") number.toString() else "$text$number"

        if (operation.isEmpty()) {
            firstNumber = textView.text.toString().toInt()
        } else {
            secondNumber = textView.text.toString().toInt()
        }
    }

    private fun operationClick(op: String) {
        if (operation.isNotEmpty() && secondNumber != 0) {
            firstNumber = calculate()
            secondNumber = 0
        }
        operation = op
        textView.text = "0"
    }

    private fun calculate(): Int {
        return when (operation) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> firstNumber / secondNumber
            else -> 0
        }
    }
}