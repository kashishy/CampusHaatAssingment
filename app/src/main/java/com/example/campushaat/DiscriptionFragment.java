package com.example.campushaat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DiscriptionFragment extends Fragment {

    private View view;
    public DiscriptionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_discription, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
