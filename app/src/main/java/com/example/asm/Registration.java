package com.example.asm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Change App Theme to Remove Title Bar
        setTheme(R.style.AppThemeForCredentials);

        setContentView(R.layout.activity_registration);

        //Move Intent from Registration Back to Login
        CardView register = findViewById(R.id.cardViewRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registration.super.onBackPressed();
            }
        });
    }
}
