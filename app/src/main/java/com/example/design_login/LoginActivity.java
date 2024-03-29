package com.example.design_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txtRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtRegister = findViewById(R.id.txtRegister);
        txtRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == txtRegister)
        {
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);
        }
    }
}
