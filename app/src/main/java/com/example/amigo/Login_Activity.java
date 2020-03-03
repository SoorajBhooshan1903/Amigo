package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText uphone, upasswrd;
    Button login;
    TextView newuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        uphone = findViewById(R.id.login_phone);
        upasswrd = findViewById(R.id.login_pass);
        login = findViewById(R.id.login);
        newuser = findViewById(R.id.textView);


        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ChooseRegistration.class);
                startActivity(i);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Activity.this, UserHome_Activity.class);
                startActivity(i);

                //startActivity(new Intent(getApplicationContext(), UserHome_Activity.class));


            }
        });
    }
}












/*
            startActivity(new Intent(getApplicationContext(), UserHome_Activity.class));


            startActivity(new Intent(getApplicationContext(), AgentHome_Activity.class));



            startActivity(new Intent(getApplicationContext(), GuideHome_Activity.class));


            Toast.makeText(Login_Activity.this, "Invalid User name or password", Toast.LENGTH_SHORT).show();

    */

