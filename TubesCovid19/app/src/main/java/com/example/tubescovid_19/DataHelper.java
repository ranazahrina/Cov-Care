package com.example.tubescovid_19;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.tubescovid_19.ListContract.*;

import androidx.annotation.Nullable;

public class DataHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "laporan.db";
    public static final int DATABASE_VERSION = 1;

    public DataHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_DATALIST_TABLE = "CREATE TABLE " +
                ListEntry.TABLE_NAME + " (" +
                ListEntry.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ListEntry.COLUMN_NIM + " TEXT NOT NULL, " +
                ListEntry.COLUMN_KONDISI + " TEXT NOT NULL, " +
                ListEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";
        Log.d("Data","onCreate: "+SQL_CREATE_DATALIST_TABLE);
        db.execSQL(SQL_CREATE_DATALIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ListEntry.TABLE_NAME);
        onCreate(db);
    }
}
