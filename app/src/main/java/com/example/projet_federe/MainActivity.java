package com.example.projet_federe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = findViewById(R.id.search);
        listView = findViewById(R.id.bandAid);
        arrayList = new ArrayList<>();
        arrayList.add("ex1");
        arrayList.add("test");
        arrayList.add("ex3");
        arrayList.add("ex4");
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
    }
}