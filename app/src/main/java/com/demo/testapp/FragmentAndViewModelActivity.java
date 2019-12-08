package com.demo.testapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.testapp.ui.fragmentandviewmodel.FragmentAndViewModelFragment;

public class FragmentAndViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_and_view_model_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentAndViewModelFragment.newInstance())
                    .commitNow();
        }
    }
}
