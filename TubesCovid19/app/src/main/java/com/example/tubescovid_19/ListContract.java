package com.example.tubescovid_19;

import android.provider.BaseColumns;

public class ListContract {

    private ListContract() {}

    public static final class ListEntry implements BaseColumns {
        public static final String TABLE_NAME = "dataList";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NIM = "nim";
        public static final String COLUMN_KONDISI = "kondisi";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
