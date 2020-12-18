package com.example.figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var createBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.no_collection_activity)

        createBtn = findViewById(R.id.create_collection_btn);
        createBtn.setOnClickListener {
            val intent = Intent(this, ChooseTypeActivity::class.java)
            startActivity(intent);
        }


    }
}