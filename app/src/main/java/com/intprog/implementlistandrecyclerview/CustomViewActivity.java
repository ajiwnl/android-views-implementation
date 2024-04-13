package com.intprog.implementlistandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class CustomViewActivity extends AppCompatActivity {

    ListView listView;

    String names[] = {"Alvin", "John", "AJ", "Chow"};

    int imgs[] = {R.drawable.pic_001, R.drawable.pic_002, R.drawable.pic_003, R.drawable.pic_004};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        listView = findViewById(R.id.customview);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), names, imgs);
        listView.setAdapter(customBaseAdapter);

        // Set click listener for the ListView items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Start ForCustomActivity when an item is clicked
                Intent intent = new Intent(CustomViewActivity.this, ForCustomActivity.class);
                // Pass data to ForCustomActivity if needed
                intent.putExtra("name", names[position]);
                intent.putExtra("image", imgs[position]);
                startActivity(intent);
            }
        });
    }
}