package com.intprog.implementlistandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ForCustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_custom);

        ImageView imageView = findViewById(R.id.imgIcon);
        TextView textView = findViewById(R.id.textView);


        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            int imageResource = extras.getInt("image");
            String name = extras.getString("name");

            imageView.setImageResource(imageResource);
            textView.setText(name);
        }
    }
}