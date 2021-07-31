package com.example.checkboxesradiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = if(cbCheese.isChecked()) "\nCheese" else ""
            val onions = if(cbOnions.isChecked()) "\nOnions" else ""
            val salad = if(cbSalad.isChecked()) "\nSalad" else ""
            val orderString = "You have ordered ${meat.text} Burger with:" + "$cheese" + "$onions" + "$salad"
            tvOrder.text = orderString
        }
    }
}