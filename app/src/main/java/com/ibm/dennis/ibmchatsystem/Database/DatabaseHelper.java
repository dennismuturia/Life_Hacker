package com.ibm.dennis.ibmchatsystem.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dennis on 11/14/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Messages.db";
    public static final String TABLE_NAME = "ChatMessages";
    public static final String COL_1 = "id";
    public static final String COL_2 = "user_messages";
    public static final String COL_3 = "bot_messages";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "user_messages TEXT, bot_messages TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
