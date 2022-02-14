package com.example.item_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }
    void initviews(){
        Button button = findViewById(R.id.button_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openborder();
            }
        });
    }
    void openborder(){
        Intent intent = new Intent(this, BorderActivity.class);
        intent.putExtra("name", "Ulugbek Abdurasulov");
        startActivity(intent);
    }
}