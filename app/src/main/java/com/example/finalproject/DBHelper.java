package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DBHelper extends SQLiteOpenHelper {

 private static final int VERSION = 1;
 private static final String DB_NAME = "myresult.db";
 public static final String TB_NAME = "tb_rates";


    public DBHelper(Context context, String name,
                    SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TB_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,CURNAME TEXT,CURRESULT TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0,int arg1,int arg2) {
        //TODO Auto-generated method stub

    }


}