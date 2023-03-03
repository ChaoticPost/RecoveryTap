package com.example.recoverytap;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recoverytap.databinding.ActivityRegistrationFullNameBinding;

public class RegistrationFullNameActivity extends AppCompatActivity {
    private ActivityRegistrationFullNameBinding binding;
//    ActivityResultLauncher<Intent> startForResult = registerForActivityResult(
//            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
//                @Override
//                public void onActivityResult(ActivityResult result) {
//                    if (result != null && result.getResultCode() == RESULT_OK) {
//                        if (result.getData() != null && result.getData().getStringExtra(RegistrationPasswordActivity.KEY) != null) {
//                            String name = result.getData().getStringExtra(RegistrationPasswordActivity.KEY);
//                            binding.textView.setText(getString(R.string.inout, name));
//                        }
//                    }
//                }
//            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationFullNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.d("myLogs", "onCreate");
        Log.e("myLogs", "onCreate");
        Log.i("myLogs", "onCreate");
        Log.v("myLogs", "onCreate");
        Log.w("myLogs", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment,RegiFullNameFragment.class,null)
                    .commit();
        }
        //ImageButton imageButton = findViewById(R.id.imageButton);
//        binding.imageButton1.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View view) {
//                Log.d("myLogs", "Button click"); ///program click
//                startForResult.launch(RegistrationPasswordActivity.newIntentRegistrationPassword(
//                        RegistrationFullNameActivity.this,
//                        binding.name.getText().toString()
//                ));
//            }
//        });
//        //TextView textView = findViewById(R.id.textView);
//        binding.textView.setText(R.string.welcome);
//        //ImageView imageView = findViewById(R.id.imageView);
//        binding.imageView.setImageResource(R.drawable.logo_only);
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


    /*public void continueRegistration(View view) {
        Log.d("myLogs","Button click"); /// declarative click
    }*/
}