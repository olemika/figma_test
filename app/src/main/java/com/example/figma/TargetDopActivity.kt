package com.example.figma

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TargetDopActivity  : AppCompatActivity() {
    private lateinit var createBtn: Button;
    private lateinit var backBtn: View;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.target_dop_activity)

        createBtn = findViewById(R.id.t_create_clct);
        backBtn = findViewById(R.id.icon_up_back3);

        backBtn.setOnClickListener{
            this.finish()
        }


    }
}