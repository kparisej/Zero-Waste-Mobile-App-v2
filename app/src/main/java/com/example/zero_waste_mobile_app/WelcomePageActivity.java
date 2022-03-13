package com.example.zero_waste_mobile_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zero_waste_mobile_app.ui.welcome.WelcomePageFragment;

public class WelcomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, WelcomePageFragment.newInstance())
                    .commitNow();
        }
    }
}