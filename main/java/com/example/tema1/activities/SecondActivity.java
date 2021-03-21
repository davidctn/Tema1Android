package com.example.h1activitiesandfragments.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.h1activitiesandfragments.R;
import com.example.h1activitiesandfragments.fragments.F1A2;
import com.example.h1activitiesandfragments.fragments.F2A2;
import com.example.h1activitiesandfragments.fragments.F3A2;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ArrayList<Fragment> allFragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        allFragments =new ArrayList<>();
        allFragments.add(new F1A2());
        allFragments.add(new F2A2());
        allFragments.add(new F3A2());

        FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer, allFragments.get(0));
        fragmentTransaction.commit();
    }
    public void addF2A2(View view)
    {
        FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, allFragments.get(1));
        fragmentTransaction.commit();
    }
    public void replaceF2A2withF3A2(View view)
    {
        FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, allFragments.get(2));
        fragmentTransaction.commit();
    }
    public void goToF1A2(View view)
    {
        findViewById(R.id.textView).setVisibility(View.VISIBLE);

        FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, allFragments.get(0));
        fragmentTransaction.commit();
    }
    public void onBackPressed()
    {
        super.onBackPressed();
        finishAffinity();
    }
    public void closeActivity(View view)
    {
        finish();
    }

}