package com.example.tubescovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infoPage(View view) {
        Intent intent = new Intent(MainActivity.this, informasiCovid.class);
        startActivity(intent);
    }

    public void laporInfo(View view) {
        Intent intent = new Intent(MainActivity.this, InputData.class);
        startActivity(intent);
    }

    public void infoZona(View view) {
        Intent intent = new Intent(MainActivity.this, MapsApi.class);
        startActivity(intent);
    }
}
