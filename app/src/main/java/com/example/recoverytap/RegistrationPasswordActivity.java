package com.example.recoverytap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recoverytap.databinding.ActivityRegistrationPasswordBinding;

public class RegistrationPasswordActivity extends AppCompatActivity {
    public static final String KEY = "user_name";
    private ActivityRegistrationPasswordBinding binding;
    private String name = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        parseIntent();

    }
    public static Intent newIntentRegistrationPassword(Context context,String name) {
        Intent intent = new Intent(context, RegistrationPasswordActivity.class);
        intent.putExtra(KEY,name);
        return intent;
    }

    @Override
    public void onBackPressed() {
        resultActivity();
        super.onBackPressed();
    }

    private void resultActivity(){
        Intent intent = new Intent();
        intent.putExtra(KEY,name);
        setResult(RESULT_OK,intent);
        finish();
    }

    private void parseIntent(){
      if (!getIntent().hasExtra(KEY)){
          throw new RuntimeException("no name");

      }
      name = getIntent().getStringExtra(KEY);
      binding.textView.setText(getString(R.string.inout,name));
    }

}
