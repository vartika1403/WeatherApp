package com.example.vartikasharma.mynewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private OkHttpClient client;
    private String url ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Start the service
    public void startService(View view) {
        startService(new Intent(this, DownloadService.class));
    }

    // Stop the service
    public void stopService(View view) {
        stopService(new Intent(this, DownloadService.class));
    }
}
