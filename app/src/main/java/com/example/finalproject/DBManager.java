package com.example.finalproject;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {
    private DBHelper dbHelper;
    private String TBNAME;

    public DBManager(Context context){
    }

    public void add(ResultItem item){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("curname",item.getCurName());
        values.put("curname",item.getCurResult());
        db.insert(TBNAME,null,values);
        db.close();
    }

    public void addAll(List<ResultItem> list){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        for(ResultItem item : list){
            ContentValues values = new ContentValues();
            values.put("curname",item.getCurName());
            values.put("curresult",item.getCurResult());
            db.insert(TBNAME,null,values);
        }
        db.close();
    }

    public void deleteAll(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete(TBNAME,null,null);
        db.close();
    }

    public void delete(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete(TBNAME, "ID=?", new String[]{String.valueOf(id)});
        db.close();
    }

    public void update(ResultItem item){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("curname", item.getCurName());
        values.put("curresult", item.getCurResult());
        db.update(TBNAME, values, "ID=?", new String[]{String.valueOf(item.getId())});
        db.close();
    }

    public List<ResultItem> listAll() {
        List<ResultItem> resultList = null;
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(TBNAME, null, null, null, null, null, null);
        if (cursor != null) {
            resultList = new ArrayList<ResultItem>();
            while (cursor.moveToNext()) {
                ResultItem item = new ResultItem();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                item.setCurName(cursor.getString(cursor.getColumnIndex("CURNAME")));
                item.setCurResult(cursor.getString(cursor.getColumnIndex("CURRESULT")));

                resultList.add(item);
            }
            cursor.close();
        }
        db.close();
        return resultList;
    }

    public ResultItem findById(int id) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(TBNAME, null, "ID=?", new String[]{String.valueOf(id)}, null, null, null);
        ResultItem resultItem = null;
        if (cursor != null && cursor.moveToFirst()) {
            resultItem = new ResultItem();
            resultItem.setId(cursor.getInt(cursor.getColumnIndex("ID")));
            resultItem.setCurName(cursor.getString(cursor.getColumnIndex("CURNAME")));
            resultItem.setCurResult(cursor.getString(cursor.getColumnIndex("CURRESULT")));
            cursor.close();
        }
        db.close();
        return resultItem;
    }
}
