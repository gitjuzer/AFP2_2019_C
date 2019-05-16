package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    ImageButton btnLeaderboard, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLeaderboard = findViewById(R.id.btnLeaderboard);
        btnProfile = findViewById(R.id.btnProfile);

        changeActivity(findViewById(R.id.card1Col1Img));
        changeActivity(findViewById(R.id.card1Col2Img));
        changeActivity(findViewById(R.id.card1Col3Img));

        changeActivity(findViewById(R.id.card2Col1Img));
        changeActivity(findViewById(R.id.card2Col2Img));
        changeActivity(findViewById(R.id.card2Col3Img));

        changeActivity(findViewById(R.id.card3Col1Img));
        changeActivity(findViewById(R.id.card3Col2Img));
        changeActivity(findViewById(R.id.card3Col3Img));

        btnLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Leaderboard.class));
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Profile.class));
            }
        });
    }

    protected void changeActivity(View v) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Lecture.class));
            }
        });
    }
}
