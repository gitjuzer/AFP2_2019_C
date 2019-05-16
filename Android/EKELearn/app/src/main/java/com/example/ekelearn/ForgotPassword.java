package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {

    TextView tvTitle, tvBack;
    EditText edtEmail;
    Button btnChangePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        tvTitle = findViewById(R.id.tvUserResultText);
        tvBack = findViewById(R.id.tvBackToLogin);
        edtEmail = findViewById(R.id.forgotEmail);
        btnChangePassword = findViewById(R.id.btnUserResultNext);

        tvTitle.setText("Elfelejtett Jelszó");
        tvBack.setText("Vissza");
        edtEmail.setHint("E-mail");
        btnChangePassword.setText("Jelszó változtatás");

        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassword.this, UserMessage.class).putExtra("MessageText", "Ellenőrizd az e-mail fiókod!").putExtra("MessageNext", "Home"));
            }
        });

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassword.this, Login.class));
            }
        });

    }
}
