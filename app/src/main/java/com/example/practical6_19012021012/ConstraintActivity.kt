package com.example.practical6_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        var bNav = findViewById<BottomNavigationView>(R.id.b_nav_constraint)
        bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.linear_layout ->{
                    Intent(this, LinearActivity :: class.java).apply {
                        startActivity(this)
                    }
                    return@setOnItemSelectedListener true
                }

                R.id.relative_layout ->{
                    Intent(this, RelativeActivity :: class.java).apply {
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