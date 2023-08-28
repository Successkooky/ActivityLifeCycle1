package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Initialize UI Elements and variables here
        Toast.makeText(this, "OnCreate() Method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {

        //Starts animations or UI related tasks

        super.onStart();
        Toast.makeText(this, "OnStart() Method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        //Starts Sensors, location updates,etc...
        super.onResume();
        Toast.makeText(this, "OnResume() Method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        //Release resources, pause ongoing operations,etc...

        super.onPause();
        Toast.makeText(this, "OnPause() Method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        //Release resources, save data,etc
        super.onStop();
    }

    @Override
    protected void onRestart() {
        //Performs any necessary restart tasks
        super.onRestart();
        Toast.makeText(this, "OnRestart() Method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //clean up resources, finalize tasks,etc
        Toast.makeText(this, "OnDestroy() Method is called", Toast.LENGTH_SHORT).show();
    }
}