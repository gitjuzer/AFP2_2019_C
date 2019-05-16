package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Leaderboard extends AppCompatActivity {

    ImageButton btnSubject, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        btnSubject = findViewById(R.id.btnSubjects);
        btnProfile = findViewById(R.id.btnProfile);

        btnSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Leaderboard.this, Menu.class));
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Leaderboard.this, Profile.class));
            }
        });
    }
}
