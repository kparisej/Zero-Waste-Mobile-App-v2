package com.example.zero_waste_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    //private Object WelcomePageActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(navView, navController);

    }
    public void callGoodbyePage(View view){
        Intent intent = new Intent(this, GoodbyeActivity.class);
        startActivity(intent);
    }
    public void sendHi(View v) {
        // Do something in response to button click
        Button button = (Button) v;
       // EditText msg = (EditText) v;

        int id = v.getId();
        if (id == R.id.button) {
           // window.setText("Throw plastic here in bin A!");
            ((EditText)findViewById(R.id.window)).setText("Throw plastic here in bin A!");
        }
        else if (id == R.id.button2) {
            //button.setText("Throw paper here in bin B!");
            ((EditText)findViewById(R.id.window)).setText("Throw paper here in bin B!");
        }
        else if (id == R.id.button3) {
           // button.setText("Throw trash here in bin C!");
            ((EditText)findViewById(R.id.window)).setText("Throw trash here in bin C!");
        }
        else if (id == R.id.button5) {
           // button.setText("Throw glass here in bin D!");
            ((EditText)findViewById(R.id.window)).setText("Throw glass here in bin D!");
        }
    }
    public void dfltMsg(View v) {
        // Do something in response to button click
        Button button = (Button) v;
        button.setText("hey");
    }
    protected void onClick(View v){
        sendHi(v);
        //v.text = "hey";
   }


}