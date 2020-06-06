package com.example.tubescovid_19;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private Context mContext;
    private Cursor mCursor;

    public ListAdapter(Context context, Cursor cursor) {
        mContext = context;
        mCursor = cursor;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        public TextView nimText;
        public TextView kondisiText;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            nimText = itemView.findViewById(R.id.textView_nim);
            kondisiText = itemView.findViewById(R.id.textView_kondisi);
        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.content_main, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        if (!mCursor.moveToPosition(position)) {
            return;
        }

        String nim = mCursor.getString(mCursor.getColumnIndex(ListContract.ListEntry.COLUMN_NIM));
        String kondisi = mCursor.getString(mCursor.getColumnIndex(ListContract.ListEntry.COLUMN_KONDISI));

        holder.nimText.setText(nim);
        holder.kondisiText.setText(kondisi);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }
}
