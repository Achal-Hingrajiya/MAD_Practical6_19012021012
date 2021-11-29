package com.example.practical6_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        var bNav = findViewById<BottomNavigationView>(R.id.b_nav_rel)

        bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.constraint_layout ->{
                    Intent(this, ConstraintActivity :: class.java).apply {
                        startActivity(this)
                    }
                    return@setOnItemSelectedListener true
                }

                R.id.linear_layout ->{
                    Intent(this, LinearActivity :: class.java).apply {
                        startActivity(this)
                    }
                    return@setOnItemSelectedListener true
                }
                else -> {

                    return@setOnItemSelectedListener true
                }
            }
        }

    }
}