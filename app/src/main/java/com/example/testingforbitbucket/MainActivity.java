package com.example.testingforbitbucket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = " hi Rahul how are you  i hope ypur aare fine as well as i am also fine";

        Log.d( "onCreate: ",str);
    }
}
