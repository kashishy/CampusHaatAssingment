package com.example.campushaat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private static final int TYPE_THREE = 3;
    List<DataHold> data;
    Context context;
    RelativeLayout relativeLayout;

    public RecyclerAdapter(List<DataHold> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(data==null)
            return 0;
        else
            return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        DataHold dataHold = data.get(position);
        if (dataHold.getType() == DataHold.DataType.ONE_ITEM) {
            return TYPE_ONE;
        } else if (dataHold.getType() == DataHold.DataType.TWO_ITEM) {
            return TYPE_TWO;
        } else if(dataHold.getType() == DataHold.DataType.THREE_ITEM) {
            return TYPE_THREE;
        } else {
            return -1;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        if (viewType == 1){
            View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_layout,viewGroup, false);
            ViewHolder userviewHolder = new ViewHolder(view);
            return userviewHolder;
        } else if(viewType == 2) {
            View view = LayoutInflater.from(context).inflate(R.layout.recycler_itme_layoutpg,viewGroup, false);
            ViewHolder userviewHolder = new ViewHolder(view);
            return userviewHolder;
        } else if (viewType == 3) {
            View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_layoutappart,viewGroup, false);
            ViewHolder userviewHolder = new ViewHolder(view);
            return userviewHolder;
        } else {
            throw new RuntimeException("The type has to be ONE or TWO");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        final DataHold  dataHold = data.get(i);
        if(holder.getItemViewType()==TYPE_ONE)
            holder.type.setText("Hostel");
        else if(holder.getItemViewType()==TYPE_TWO)
            holder.type.setText("PG");
        else
            holder.type.setText("Appartment");
        holder.name.setText(dataHold.name);
        holder.phone.setText(dataHold.phone);
        holder.address.setText(dataHold.address);
        Glide.with(context).load(dataHold.image).into(holder.imageShow);
    }
}
