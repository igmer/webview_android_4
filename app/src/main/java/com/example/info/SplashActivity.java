package com.example.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Intent intent = new Intent(getApplicationContext(),SuperiorActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        }


        }

}
