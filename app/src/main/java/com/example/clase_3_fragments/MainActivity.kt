package com.example.clase_3_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.clase_3_fragments.fragments.DayModeFragment
import com.example.clase_3_fragments.fragments.NightModeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var fabButton: FloatingActionButton
    private var modoLigh: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, NightModeFragment()).commit()
       fabButton = findViewById(R.id.fabButton)

       fabButton.setOnClickListener{

           if (modoLigh) {
               supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, NightModeFragment()).commit()
           } else {
               supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, DayModeFragment()).commit()
           }
           modoLigh = !modoLigh
       }
    }
}
