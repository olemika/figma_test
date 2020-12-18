package com.example.figma

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class ChooseTypeActivity: AppCompatActivity() {
    private lateinit var targetClct: RelativeLayout;
    private lateinit var regularClct: RelativeLayout;
    private lateinit var backBtn: View;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_type_activity)

        targetClct = findViewById(R.id.for_collect_bnn);
        regularClct = findViewById(R.id.for_regular_collect_bnn);
        backBtn = findViewById(R.id.icon_up_back)

        backBtn.setOnClickListener {
            this.finish();
        }
    }
}