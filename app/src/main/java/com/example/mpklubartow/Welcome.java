package com.example.mpklubartow;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(getApplicationContext(),MapsActivity.class);
            Welcome.this.startActivity(i);
            Welcome.this.finish();
        }, 1500);
    }
}