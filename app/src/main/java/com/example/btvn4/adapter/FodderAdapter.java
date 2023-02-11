package com.example.btvn4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn4.R;
import com.example.btvn4.modle.fodder;

import java.util.List;

public class FodderAdapter extends RecyclerView.Adapter<FodderAdapter.FodderViewHolder> {
    List<fodder> fodderList;

    public FodderAdapter(List<fodder> fodderList) {
        this.fodderList = fodderList;
    }

    @NonNull
    @Override
    public FodderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_folder,parent,false);
        return new FodderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FodderViewHolder holder, int position) {
        holder.setdata(fodderList.get(position));
    }

    @Override
    public int getItemCount() {
        if (fodderList != null){
            return fodderList.size();
        }
        return 0;
    }

    protected class FodderViewHolder extends RecyclerView.ViewHolder {

        private TextView tvFodder;
        public FodderViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFodder=itemView.findViewById(R.id.nameFodder);
        }
        public void setdata(fodder fodder){
            tvFodder.setText(fodder.getNameFodder());
        }
    }
}
