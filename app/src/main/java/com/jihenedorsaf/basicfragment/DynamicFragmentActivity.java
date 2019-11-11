package com.jihenedorsaf.basicfragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jihenedorsaf.basicfragment.fragments.MyDynamicFragment;

public class DynamicFragmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MyDynamicFragment()).commit();
    }
}
