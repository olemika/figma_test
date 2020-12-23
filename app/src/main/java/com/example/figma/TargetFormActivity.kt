package com.example.figma

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TargetFormActivity : AppCompatActivity() {
    private lateinit var btn: Button;
    private lateinit var backBtn: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.target_form_activity)

        btn = findViewById(R.id.tform_dalee);
        btn.setOnClickListener {
        val intent = Intent(this, TargetDopActivity::class.java)
        startActivity(intent);}
        backBtn = findViewById(R.id.icon_up_back2)
        backBtn.setOnClickListener{
            this.finish()
        }

    }
}