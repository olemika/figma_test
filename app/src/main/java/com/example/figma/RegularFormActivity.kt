package com.example.figma

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegularFormActivity : AppCompatActivity() {
    private lateinit var btn: Button;
    private lateinit var backBtn: View;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regular_form_activity)

        btn = findViewById(R.id.rform_dalee);
        backBtn = findViewById(R.id.icon_up_back1);
        backBtn.setOnClickListener {
            this.finish()
        }

    }
}