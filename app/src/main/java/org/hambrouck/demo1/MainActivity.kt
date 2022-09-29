package org.hambrouck.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var numberText: TextView
    private lateinit var lowerButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberText = findViewById(R.id.txt_number)
        lowerButton = findViewById(R.id.btn_lower)

        // attach a listener to a button
        lowerButton.setOnClickListener {
            changeText()
        }
    }

    private fun changeText()
    {
        numberText.text = getString(R.string.button_clicked)
        val numberAsString = "10"
        var number = numberAsString.toInt() + 4
        Toast.makeText(this, "Display a short message (don't overuse this)", Toast.LENGTH_SHORT).show()
    }
}