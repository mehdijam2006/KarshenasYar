package com.example.dabirkhaneh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "سلام! این اپلیکیشن «دابیرخانه» است.\nکارکرد آفلاین و پشتیبانی از فارسی."
        textView.textDirection = android.view.View.TEXT_DIRECTION_RTL
        setContentView(textView)
    }
}
