package com.example.kuantansejahtera_a170567.SubFragment;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;


import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuantansejahtera_a170567.R;

import java.util.List;

public class Info_adapter extends RecyclerView.Adapter<Info_adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;



    public Info_adapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.info_custom,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        String title = data.get(i);
        viewHolder.textTitle.setText(title);





    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       private TextView textTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textTitle = (TextView)itemView.findViewById(R.id.textTitle);

        }
    }
}