package com.example.campushaat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapterAppart extends RecyclerView.Adapter<ViewHolder> {
    List<DataHold> data;
    Context context;

    public RecyclerAdapterAppart(List<DataHold> data, Context context) {
        this.data = data;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_layoutappart,viewGroup, false);
        ViewHolder userviewHolder = new ViewHolder(view);
        return userviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        final DataHold  dataHold = data.get(i);
        holder.name.setText(dataHold.name);
        holder.type.setText(dataHold.type);
        holder.phone.setText(dataHold.phone);
        holder.address.setText(dataHold.address);
        Glide.with(context).load(dataHold.image).into(holder.imageShow);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
