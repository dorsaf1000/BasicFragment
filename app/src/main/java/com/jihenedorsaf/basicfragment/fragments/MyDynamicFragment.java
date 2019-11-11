package com.jihenedorsaf.basicfragment.fragments;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.jihenedorsaf.basicfragment.R;

public class MyDynamicFragment extends Fragment{
    public MyDynamicFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflatethe layoutfor thisfragment
        return inflater.inflate(R.layout.fragment_my_dynamic, container, false);}
    }

