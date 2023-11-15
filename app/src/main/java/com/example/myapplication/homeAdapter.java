package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.homeViewholder> {
    List<homeModel>list;

    public homeAdapter(List<homeModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public homeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home,parent,false);
        return new homeViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeViewholder holder, int position) {
        holder.name.setText(String.valueOf(list.get(position).getName()));
        holder.home_Name.setText(String.valueOf(list.get(position).getHomeName()));
        holder.narx.setText(String.valueOf(list.get(position).getNarx()));
        holder.avatar.setImageResource(list.get(position).getAvatar());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class homeViewholder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView name,home_Name,narx;
        public homeViewholder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            home_Name = itemView.findViewById(R.id.home_Name);
            narx = itemView.findViewById(R.id.narx);
        }
    }
}
