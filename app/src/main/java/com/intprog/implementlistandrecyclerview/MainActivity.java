package com.intprog.implementlistandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.toListView);
        btn2 = findViewById(R.id.toCustomView);
        btn3 = findViewById(R.id.toRecyclerView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toList = new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(toList);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent toCustom = new Intent(MainActivity.this, CustomViewActivity.class);
             startActivity(toCustom);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent toRecycler = new Intent(MainActivity.this, RecyclerActivity.class);
                   startActivity(toRecycler);
            }
        });
    }
}