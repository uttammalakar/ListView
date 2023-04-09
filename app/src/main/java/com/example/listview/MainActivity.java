package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listViuId);
        String[] countryname=getResources().getStringArray(R.array.country);
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.sample_view,R.id.samTextId,countryname);
        listView.setAdapter(arrayAdapter);
    }
}