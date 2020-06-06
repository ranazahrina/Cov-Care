package com.example.tubescovid_19;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TampilListData extends AppCompatActivity {
    private SQLiteDatabase mDatabase;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_list_data);

        DataHelper dbHelper = new DataHelper(this);
        mDatabase = dbHelper.getReadableDatabase();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ListAdapter(this, getAllItems());
        recyclerView.setAdapter(mAdapter);
    }

    public Cursor getAllItems() {
        return mDatabase.query(
                ListContract.ListEntry.TABLE_NAME,
                new String[]{ListContract.ListEntry.COLUMN_NIM, ListContract.ListEntry.COLUMN_KONDISI},
                null,
                null,
                null,
                null,
                null
        );
    }

    public void inputLapor(View view) {
        Intent intent = new Intent(TampilListData.this, InputData.class);
        startActivity(intent);
    }
}
