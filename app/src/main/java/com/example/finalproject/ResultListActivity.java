package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultListActivity extends ListActivity {


    private final String TAG = "ResultListActivity";
    Handler handler;
    private ArrayList<HashMap<String,String>> listItems;
    private SimpleAdapter listItemAdapter;
    private int msgWhat = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initListView();
        this.setListAdapter(listItemAdapter);
    }
    private void initListView(){
        listItems = new ArrayList<HashMap<String, String>>();
        for(int i = 0; i<10; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("ItemTitle", "Result: " + i);
            map.put("ItemDetail", "Result: " + i);
            listItems.add(map);
        }
        //生成适配器的Item和动态数组对应的元素
        listItemAdapter = new SimpleAdapter(this,listItems,//listItems数据源
                R.layout.list_item,//ListItem的XML布局实现
                new String[]{"ItemTitle","ItemDetail"},
                new int[]{R.id.itemTitle,R.id.itemDetail});

    }
}