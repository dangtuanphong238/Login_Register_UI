package com.example.design_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtSignIn = findViewById(R.id.txtSignIn);
        txtSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == txtSignIn)
        {
            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(intent);
        }
    }
}
