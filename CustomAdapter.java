package com.example.kuantansejahtera_a170567;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet;
    private int[] mDataSet3;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView icon;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getLayoutPosition() + " clicked.");
                }
            });
            textView = (TextView) v.findViewById(R.id.title);
            icon = (ImageView) v.findViewById(R.id.thumbnail);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return icon;
        }
    }

    public CustomAdapter(String[] dataSet, int[] dataSet3) {
        this.mDataSet = dataSet;
        this.mDataSet3 = dataSet3;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_layout, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");


        viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getImageView().setImageResource(mDataSet3[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}