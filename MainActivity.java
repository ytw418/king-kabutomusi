package com.ytw418.kabutomusi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id_id;
    Button btn_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         id_id = findViewById(R.id.id_id);
         btn_id = findViewById(R.id.btn_id);


        btn_id.setOnClickListener(new View.OnClickListener()
        {
         @Override
         public void onClick(View v)
         {
             id_id.setText("완료");
         }
        });



    }
}


