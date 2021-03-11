package com.ytw418.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        id = findViewById(R.id.id);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str1");

        id.setText(str);






    }
}