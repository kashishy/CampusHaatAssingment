package com.example.campushaat;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class PGFragment extends Fragment {

    private RecyclerView recyclerView;
    private Context context;
    private View view;
    private List<DataHold> data;
    private RecyclerAdapterPG recyclerAdapter;
    private ProgressDialog progressDialog;
    public PGFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pg, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        data = new ArrayList<>();
        context = getContext();
        recyclerView = view.findViewById(R.id.recyclerViewPG_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        progressDialog = new ProgressDialog(context);
        progressDialog.create();
        progressDialog.setCanceledOnTouchOutside(true);
        progressDialog.setTitle("Peying Guest House");
        progressDialog.setMessage("Loading Please Wait...!!!");
        progressDialog.show();
        DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("PG");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists())
                {
                    for (DataSnapshot dataSnap : dataSnapshot.getChildren())
                    {
                        DataHold dataHold = dataSnap.getValue(DataHold.class);
                        data.add(dataHold);
                    }
                }
                recyclerAdapter = new RecyclerAdapterPG(data,context);
                recyclerView.setAdapter(recyclerAdapter);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(context,databaseError.getMessage(),Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }
}
