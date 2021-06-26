package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DBHelper extends SQLiteOpenHelper {

 private static final int VERSION = 1;
 private static final String DB_NAME = "myresult.db";
 public static final String TB_NAME = "tb_rates";
 public static final String CREATE_NUMBER=
         "create table Number("+
                 "id interger primary key autoincrement," +
                 "Number of calculations，" +
                 "Result)";
                 private Context mContext;

    public DBHelper(Context context, int version){
        super(context,"myresult.db",null,version);
        mContext=context;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TB_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,CURNAME TEXT,CURRESULT TEXT)");
        Toast.makeText(mContext,"yes",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0 ,int arg1,int arg2) {
        arg0.execSQL("drop table if exists numbers");
        arg0.execSQL("drop table if exists Category");
        onCreate(arg0);//升级数据库
        //TODO Auto-generated method stub

    }


}