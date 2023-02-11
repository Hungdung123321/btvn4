package com.example.btvn4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.btvn4.adapter.FodderAdapter;
import com.example.btvn4.modle.fodder;

import java.util.ArrayList;
import java.util.List;

public class folder extends AppCompatActivity {
    RecyclerView rcvFodder;
    FodderAdapter adapter;
    List<fodder> fodderList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);
        rcvFodder=findViewById(R.id.rcvFolder);
        adapter=new FodderAdapter(creatFodder());
        rcvFodder.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        rcvFodder.setAdapter(adapter);
        rcvFodder.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
    protected List<fodder> creatFodder(){
        fodderList=new ArrayList<>();
        fodderList.add(new fodder("Video"));
        fodderList.add(new fodder("Android"));
        fodderList.add(new fodder("Applock"));
        fodderList.add(new fodder("Books"));
        fodderList.add(new fodder("map"));
        fodderList.add(new fodder("Authenticate Using Google..."));
        fodderList.add(new fodder("New folder"));
        fodderList.add(new fodder("New folder 1"));
        return fodderList;
    }
}