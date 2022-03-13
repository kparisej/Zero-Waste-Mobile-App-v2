package com.example.zero_waste_mobile_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zero_waste_mobile_app.ui.welcome.WelcomePageFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GoodbyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_goodbye_fragment);

    }
    public void callWelcomePage(View view){
        Intent intent = new Intent(this, WelcomePageActivity.class);
        startActivity(intent);
    }

}