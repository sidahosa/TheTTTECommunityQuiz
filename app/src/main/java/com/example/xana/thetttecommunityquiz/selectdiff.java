package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class selectdiff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectdiff);
        final MediaPlayer theme = MediaPlayer.create(this, R.raw.guard_whistle2);

        Button select5 = (Button) findViewById(R.id.question5);
        select5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 5;
                selectdiff.this.finish();
            }
        });

        Button select10 = (Button) findViewById(R.id.questions10);
        select10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 10;
                selectdiff.this.finish();
            }
        });

        Button select15 = (Button) findViewById(R.id.questions15);
        select15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 15;
                selectdiff.this.finish();
            }
        });

        Button select20 = (Button) findViewById(R.id.questions20);
        select20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 20;
                selectdiff.this.finish();
            }
        });

        Button select25 = (Button) findViewById(R.id.questions25);
        select25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 25;
                selectdiff.this.finish();
            }
        });

        Button select30 = (Button) findViewById(R.id.questions30);
        select30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectdiff.this, quizscreen.class);
                startActivity(intent);
                if(AdminPicked.music == 1) theme.start();
                AdminPicked.numberofquestions = 30;
                selectdiff.this.finish();
            }
        });
    }

}
