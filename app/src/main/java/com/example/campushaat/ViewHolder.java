package com.example.campushaat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView imageShow;
    TextView name,type,address,phone;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageShow = itemView.findViewById(R.id.recyclerItemImage_id);
        name = itemView.findViewById(R.id.recyclerItemName_id);
        type = itemView.findViewById(R.id.recyclerItemType_id);
        address = itemView.findViewById(R.id.recyclerItemAddress_id);
        phone = itemView.findViewById(R.id.recyclerItemPhone_id);
    }
}
