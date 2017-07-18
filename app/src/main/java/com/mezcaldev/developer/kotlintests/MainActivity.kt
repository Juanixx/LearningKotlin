package com.mezcaldev.developer.kotlintests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var x: View = findViewById(R.id.segundoTextView);

        if (x is TextView) {
            x.text = Person("Juan", "Eduardo").getFullName()
        }

    }
}
