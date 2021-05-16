package com.example.kuantansejahtera_a170567.SubFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuantansejahtera_a170567.R;

import java.util.ArrayList;

public class Info_main extends  AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> items;

   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.info_main, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        Info_adapter infoadapter = new Info_adapter(getContext(), items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(infoadapter);
        return view;
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("Panduan Jarak Sosial");
        items.add("Penyebaran Maklumat");
        items.add("Norma Baharu di Sekolah");
        items.add("Saranan Kepada Ibu-Bapa");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Info_adapter(this,items);
        recyclerView.setAdapter(adapter);

    }
    }
