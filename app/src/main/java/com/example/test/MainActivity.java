package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pendu = findViewById(R.id.pendu);
        ImageView penduI = findViewById(R.id.img_pendu);

        pendu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penduActivity = new Intent (getApplicationContext(), com.example.test.pendu.class);
                startActivity(penduActivity);
            }
        });
        penduI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penduActivity = new Intent (getApplicationContext(), com.example.test.pendu.class);
                startActivity(penduActivity);
            }
        });

        Button snake = findViewById(R.id.snake);
        ImageView snakeI = findViewById(R.id.img_snake);

        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent snakeActivity = new Intent (getApplicationContext(), com.example.test.SnakeGame.class);
                startActivity(snakeActivity);
            }
        });
        snakeI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent snakeActivity = new Intent (getApplicationContext(), com.example.test.SnakeGame.class);
                startActivity(snakeActivity);
            }
        });



    }
}