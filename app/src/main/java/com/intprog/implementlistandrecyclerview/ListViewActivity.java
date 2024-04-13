package com.intprog.implementlistandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

   ListView listViewid;
    Button btn;
    EditText input;
    ArrayList<String> shoplist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listViewid = findViewById(R.id.listView1);
        btn = findViewById(R.id.addButton);
       input = findViewById(R.id.inputbox);
       shoplist = new ArrayList<>();

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, shoplist);
        listViewid.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = input.getText().toString();
                if (!name.isEmpty()) {
                    shoplist.add(name);
                    adapter.notifyDataSetChanged();
                }
            }
        });

        listViewid.setOnItemClickListener((parent, view, position, id) -> {
            String clickedStudentName = shoplist.get(position);
            callActivity(clickedStudentName);
        });


    }

    private void callActivity(String clickedtoView) {
        Intent intent = new Intent(this, ViewList1Activity.class);
        intent.putExtra("EXTRA_IN", clickedtoView);
        startActivity(intent);
    }
}