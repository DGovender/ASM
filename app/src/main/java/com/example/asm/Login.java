 package com.example.asm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Change App Theme to Remove Title Bar
        setTheme(R.style.AppThemeForCredentials);

        setContentView(R.layout.activity_login);

        //Move Intent from Login to Registration
        TextView register = findViewById(R.id.txtViewRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, Registration.class);
                //startActivity(intent);
            }
        });
    }
}
