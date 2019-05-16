package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task extends AppCompatActivity {

    TextView tvTaskTitle, tvTaskQuestion;
    Button btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        tvTaskTitle = findViewById(R.id.tvTaskTitle);
        tvTaskQuestion = findViewById(R.id.tvTaskQuestion);
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);
        btnAnswer4 = findViewById(R.id.btnAnswer4);

        tvTaskTitle.setText("Petőfi Sándor");
        tvTaskQuestion.setText("Mikor született Petőfi Sándor?");

        btnAnswer1.setText("1910. Január 1.");
        btnAnswer2.setText("1823. Január 1.");
        btnAnswer3.setText("1812. Január 1.");
        btnAnswer4.setText("1794. Január 1.");

        badAnswer(btnAnswer1);
        goodAnswer(btnAnswer2);
        badAnswer(btnAnswer3);
        badAnswer(btnAnswer4);
    }

    protected void badAnswer(View v) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Task.this, UserMessage.class).putExtra("MessageText", "Rossz válasz!").putExtra("MessageNext", "BadAnswer").putExtra("MessageNextBtn", "Újra"));
            }
        });
    }

    protected void goodAnswer(View v) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Task.this, UserMessage.class).putExtra("MessageText", "Helyes válasz!").putExtra("MessageNext", "GoodAnswer"));
            }
        });
    }
}
