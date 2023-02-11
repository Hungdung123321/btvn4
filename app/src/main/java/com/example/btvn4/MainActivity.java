package com.example.btvn4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.btvn4.adapter.GroupAdapter;
import com.example.btvn4.modle.Group;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvGroup;
    GroupAdapter groupAdapter;
    List<Group> groupList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvGroup=findViewById(R.id.rcvGroups);
        groupAdapter=new GroupAdapter(creatGroup());
        rcvGroup.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        rcvGroup.setAdapter(groupAdapter);
        rcvGroup.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
    private List<Group> creatGroup(){
        groupList=new ArrayList<>();
        groupList.add(new Group(R.drawable.rectangle,"Mua bán có Tâm",8,"+10 bài viết mới nhất","Nhóm đóng"));
        groupList.add(new Group(R.drawable.rectangle1,"Ăn để lăn",8,"+10 bài viết mới nhất","Nhóm kín"));
        groupList.add(new Group(R.drawable.rectangle2,"Chia sẻ kiến thức tài liệu Montessori",1.7f,"+10 bài viết mới nhất","Nhóm MỞ"));
        groupList.add(new Group(R.drawable.rectangle3,"Thực đơn Eat-Clean giảm cân khỏe đẹp",11,"+20 bài viết mới nhất","Nhóm MỞ"));
        groupList.add(new Group(R.drawable.rectangle4,"Easy Kento for busy People",8,"+10 bài viết mới nhất","Nhóm kín"));
        groupList.add(new Group(R.drawable.rectangle5,"OFFB",8,"+10 bài viết mới nhất","Nhóm MỞ"));
        groupList.add(new Group(R.drawable.rectangle6,"Thực đơn Eat-Clean giảm cân khỏe đẹp",11,"+20 bài viết mới nhất","Nhóm MỞ"));
        groupList.add(new Group(R.drawable.rectangle,"Easy Kento for busy People",8,"+10 bài viết mới nhất","Nhóm kín"));
        return groupList;
    }

    public void nextActivty(View view) {
        Intent i=new Intent(this,folder.class);
        startActivity(i);
    }
}