package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class ResultListActivity extends ListActivity {

    private String[] list_data = {"one","two","three","four"};
    int msgWhat = 3;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListAdapter adapter = new ArrayAdapter<String>(ResultListActivity.this,android.R.layout.simple_list_item_1,list_data);
        setListAdapter(adapter);


    }
}