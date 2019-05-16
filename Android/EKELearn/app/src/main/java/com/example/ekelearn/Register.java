package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    TextView txtRegister;
    EditText edtUsername, edtEmail, edtPassword, edtPassword1;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtRegister = findViewById(R.id.tvUserResultText);
        edtUsername = findViewById(R.id.forgotEmail);
        edtEmail = findViewById(R.id.registerEmail);
        edtPassword = findViewById(R.id.loginPassword);
        edtPassword1 = findViewById(R.id.registerPassword1);
        btnRegister = findViewById(R.id.btnUserResultNext);

        txtRegister.setText("Fiók létrehozása");
        edtUsername.setHint("Felhasználónév");
        edtEmail.setHint("Email");
        edtPassword.setHint("Jelszó");
        edtPassword1.setHint("Jelszó Megerősítése");
        btnRegister.setText("Regisztráció");

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, UserMessage.class).putExtra("MessageText", "Sikeres regisztráció").putExtra("MessageNext", "Menu"));
            }
        });
    }
}
