package com.example.item_java;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BorderActivity extends AppCompatActivity {
    static final String TAG = BorderActivity.class.toString();
TextView boreder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_border);
            initviews();
    }
    void initviews(){
     boreder = findViewById(R.id.textwiew_tv);
     String name = getIntent().getStringExtra("name");
     Log.d(TAG, name);

     boreder.setText(name);
    }
}