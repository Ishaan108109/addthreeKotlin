package com.example.addthreekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var previousResult: TextView
    private lateinit var third: EditText
    private lateinit var addThree: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        addThree = findViewById(R.id.add_third)
        third = findViewById(R.id.num_three)
        previousResult = findViewById(R.id.prev_result)

        val data = intent.getIntExtra("Sum", 0)
        previousResult.text = data.toString()

        addThree.setOnClickListener {
            val three_ = third.text.toString().toInt()
            val result = data + three_

            val intent2 = Intent(this@SecondActivity, MainActivity::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent2.putExtra("Finalsum", result)
            startActivity(intent2)
        }
    }
}



