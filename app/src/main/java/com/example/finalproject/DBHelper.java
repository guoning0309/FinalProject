package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DBHelper extends SQLiteOpenHelper {

/*   public static final String TB_NAME="result";
    public static final int DB_VERSION=1;

    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+TB_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,CURNAME TEXT, CURRATE TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

 */
public static final String RESULT_LIST="create table RList("
        +"id integer primary key autoincrement,"
        +"学号 integer,"
        +"姓名 text,"
        +"运算过程 text,"
        +"运算结果 text)";
    private Context Rcontext;

    public DBHelper(Context context, String name,
                            SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        Rcontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(RESULT_LIST);
        Toast.makeText(Rcontext, "创建成功", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}