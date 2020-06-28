package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;


    String data1,data2;
    int myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);



        getData();
        setData();
    }
    private void getData() {
        if (getIntent().hasExtra("myImageView") && getIntent().hasExtra("data1")
                && getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImageView = getIntent() .getIntExtra("myImageView", 1);
        }
    }
    private void setData(){

        mainImageView.setImageResource(myImageView);
    }
}