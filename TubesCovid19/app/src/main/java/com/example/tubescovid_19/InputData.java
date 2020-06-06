package com.example.tubescovid_19;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputData extends AppCompatActivity {
    private EditText mNim, mKondisi;
    //declare database
    private SQLiteDatabase mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        //Enable writeable database
        DataHelper dbHelper = new DataHelper(this);
        mDatabase = dbHelper.getWritableDatabase();

        mNim = findViewById(R.id.inputNim);
        mKondisi = findViewById(R.id.inputKondisi);

        Button buttonSimpan = findViewById(R.id.button_simpan);
        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //insert database
                String nim = mNim.getText().toString();
                String kondisi = mKondisi.getText().toString();
                ContentValues cv = new ContentValues();
                cv.put(ListContract.ListEntry.COLUMN_NIM, nim);
                cv.put(ListContract.ListEntry.COLUMN_KONDISI, kondisi);

                mDatabase.insert(ListContract.ListEntry.TABLE_NAME, null, cv);
                Toast.makeText(InputData.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();

                mNim.getText().clear();
                mKondisi.getText().clear();
            }
        });

        Button buttonTampil = findViewById(R.id.button_tampil);
        buttonTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputData.this, TampilListData.class);
                startActivity(intent);
            }
        });
    }

    public void backToHome(View view) {
        Intent intent = new Intent(InputData.this, MainActivity.class);
        startActivity(intent);
    }
}
