package com.example.kuantansejahtera_a170567.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kuantansejahtera_a170567.R;
import com.example.kuantansejahtera_a170567.SubFragment.Info_adapter;
import com.example.kuantansejahtera_a170567.SubFragment.Info_main;

import java.util.ArrayList;

public class Info2Fragment extends Fragment {
private RecyclerView recyclerView;
    ArrayList<String> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info2, container, false);
    }
        /* recyclerView= (RecyclerView) view.findViewById(R.id.recyclerView);
        Info_adapter infoadapter=new Info_adapter(getContext(),items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(infoadapter);
         return view;*/

       /* Button button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Info_main.class);
                //in.putExtra("some","some data");
                startActivity(in);
            }
        });
        return view;*/
    }

