package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserMessage extends AppCompatActivity {

    TextView tvText;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_message);

        tvText = findViewById(R.id.tvUserResultText);
        btnNext = findViewById(R.id.btnUserResultNext);
        btnNext.setText("Folytatás");

        Intent intent = getIntent();
        tvText.setText(intent.getStringExtra("MessageText"));
        final String nextWindow = intent.getStringExtra("MessageNext");

        if(intent.getExtras().containsKey("MessageNextBtn")) {
            btnNext.setText(intent.getStringExtra("MessageNextBtn"));
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (nextWindow) {
                    case "Home":
                        startActivity(new Intent(UserMessage.this, Main.class));
                        break;

                    case "Menu":
                        startActivity(new Intent(UserMessage.this, Menu.class));
                        break;

                    case "GoodAnswer":
                        startActivity(new Intent(UserMessage.this, Menu.class));
                        break;

                    case "BadAnswer":
                        startActivity(new Intent(UserMessage.this, Task.class));
                        break;

                    default:
                        startActivity(new Intent(UserMessage.this, Main.class));
                        break;
                }

            }
        });

    }
}
