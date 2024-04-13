package com.intprog.implementlistandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewList1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list1);

        String getSampleData = getIntent().getStringExtra("EXTRA_IN");

        TextView txtview = findViewById(R.id.itemadd1);
        txtview.setText(getSampleData);
    }
}