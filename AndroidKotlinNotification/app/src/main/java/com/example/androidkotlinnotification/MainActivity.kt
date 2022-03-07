package com.example.androidkotlinnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidkotlinnotification.ui.EggTimerFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
    }
}