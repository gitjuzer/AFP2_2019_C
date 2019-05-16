package com.example.ekelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lecture extends AppCompatActivity {

    TextView tvLecture;
    Button btnTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture);

        tvLecture = findViewById(R.id.tvLectureText);
        btnTask = findViewById(R.id.btnTask);

        tvLecture.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum et dignissim leo. " +
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. " +
                "Proin vestibulum massa mi, non sodales magna blandit nec. Pellentesque in massa in tortor bibendum ultrices. Integer egestas hendrerit rhoncus. " +
                "Aliquam erat volutpat. Nullam imperdiet, nisl eu tempor volutpat, nisi augue venenatis lectus, rutrum dignissim sapien lorem a erat. " +
                "Aenean facilisis interdum dolor id accumsan.\n\n" +
                "Curabitur quis nunc odio. Praesent sed rhoncus urna. Donec ac sapien ut felis ultrices pretium ut quis turpis. Nunc ultricies consectetur tellus in posuere. " +
                "Mauris fringilla sollicitudin hendrerit. " +
                "Nulla elit felis, malesuada vitae lectus vitae, tristique lacinia ante. " +
                "Pellentesque condimentum convallis augue, fermentum iaculis mauris sodales eu." +
                "");



        btnTask.setText("Vizsga");

        btnTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lecture.this, Task.class));
            }
        });
    }
}
