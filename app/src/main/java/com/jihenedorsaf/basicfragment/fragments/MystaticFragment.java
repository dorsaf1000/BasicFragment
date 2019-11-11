package com.jihenedorsaf.basicfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jihenedorsaf.basicfragment.R;

public class MystaticFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_my_static, container, false);
    }
}
