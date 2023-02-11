package com.example.btvn4.adapter;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn4.R;
import com.example.btvn4.modle.Group;

import java.util.List;
import java.util.zip.Inflater;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewHolder> {
    @NonNull
    List<Group> groupList;

    public GroupAdapter(@NonNull List<Group> groupList) {
        this.groupList = groupList;
    }

    public void setGroupList(@NonNull List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item, parent, false);
        return new GroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {
        holder.setData(groupList.get(position));
    }

    @Override
    public int getItemCount() {
        if (groupList != null) {
            return groupList.size();
        }
        return 0;
    }

    protected class GroupViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvFan, tvPosts, tvGroupStatus;
        private ImageView image;

        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvFan = itemView.findViewById(R.id.tvFan);
            tvPosts = itemView.findViewById(R.id.tvPosts);
            tvGroupStatus = itemView.findViewById(R.id.tvGroupStatus);
            image = itemView.findViewById(R.id.image);
        }

        public void setData(Group group) {

            image.setBackgroundResource(Integer.parseInt(group.getImage()));
            tvTitle.setText(group.getGroupTitle());
            tvFan.setText(group.getFan() + "k");
            tvPosts.setText(group.getPosts());
            tvGroupStatus.setText(group.getStatus());
            switch (tvGroupStatus.getText().toString()) {
                case "Nhóm đóng":
                    tvGroupStatus.setTextColor(Color.parseColor("#8E8E8E"));
                    break;
                case "Nhóm kín":
                    tvGroupStatus.setTextColor(Color.parseColor("#FF9500"));
                    break;
                case "Nhóm MỞ":
                    tvGroupStatus.setTextColor(Color.parseColor("#1F9FFC"));
                    break;
                default:
                    tvGroupStatus.setTextColor(Color.BLACK);
                    break;
            }
        }
    }
}
