package com.example.recoverytap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationFullNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_full_name);

        Log.d("myLogs", "onCreate");
        Log.e("myLogs", "onCreate");
        Log.i("myLogs", "onCreate");
        Log.v("myLogs", "onCreate");
        Log.w("myLogs", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        ImageButton imageButton = findViewById(R.id.imageButton);
        TextView textView = findViewById(R.id.textView);
        textView.setText(R.string.welcome);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo_only);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myLogs", "onStart");
        Log.e("myLogs", "onStart");
        Log.i("myLogs", "onStart");
        Log.v("myLogs", "onStart");
        Log.w("myLogs", "onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myLogs", "onResume");
        Log.e("myLogs", "onResume");
        Log.i("myLogs", "onResume");
        Log.v("myLogs", "onResume");
        Log.w("myLogs", "onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myLogs", "onPause");
        Log.e("myLogs", "onPause");
        Log.i("myLogs", "onPause");
        Log.v("myLogs", "onPause");
        Log.w("myLogs", "onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myLogs", "onStop");
        Log.e("myLogs", "onStop");
        Log.i("myLogs", "onStop");
        Log.v("myLogs", "onStop");
        Log.w("myLogs", "onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myLogs", "onDestroy");
        Log.e("myLogs", "onDestroy");
        Log.i("myLogs", "onDestroy");
        Log.v("myLogs", "onDestroy");
        Log.w("myLogs", "onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }



}