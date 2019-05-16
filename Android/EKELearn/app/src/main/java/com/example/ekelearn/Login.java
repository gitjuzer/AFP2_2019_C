package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView txtLogin, txtForgotPassword, txtRegisterUrl;
    EditText edtUsername, edtPassword;
    Button btnLoginSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogin = findViewById(R.id.tvUserResultText);
        txtForgotPassword = findViewById(R.id.tvForgotPassword);
        edtUsername = findViewById(R.id.forgotEmail);
        edtPassword = findViewById(R.id.loginPassword);
        btnLoginSubmit = findViewById(R.id.btnUserResultNext);
        txtRegisterUrl = findViewById(R.id.tvBackToLogin);

        txtLogin.setText("Bejelentkezés");
        txtForgotPassword.setText("Elfelejtett jelszó");
        edtUsername.setHint("Felhasználónév");
        edtPassword.setHint("Jelszó");
        btnLoginSubmit.setText("Bejelentkezés");
        txtRegisterUrl.setText("Regisztráció");

        btnLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Menu.class));
            }
        });

        txtRegisterUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });

        txtForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, ForgotPassword.class));
            }
        });
    }
}
