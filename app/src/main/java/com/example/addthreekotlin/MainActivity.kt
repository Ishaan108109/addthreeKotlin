
package com.example.addthreekotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var one: EditText
    private lateinit var two: EditText
    private lateinit var addFirst: Button
    private lateinit var finalRes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFirst = findViewById(R.id.add)
        one = findViewById(R.id.num_one)
        two = findViewById(R.id.num_two)

        addFirst.setOnClickListener {
            val one_ = one.text.toString().toInt()
            val two_ = two.text.toString().toInt()
            val result = one_ + two_

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Sum", result)
            startActivity(intent)
        }

        finalRes = findViewById(R.id.Final_result)
        val newdata = intent.getIntExtra("Finalsum", 0)
        finalRes.text = newdata.toString()
    }
}
