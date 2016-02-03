package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class answerspage extends AppCompatActivity {

    TextView questionText;
    String complete_answers = "";
    int index = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answerspage);
        final MediaPlayer home = MediaPlayer.create(this, R.raw.signal_change);
        questionText = (TextView) findViewById(R.id.answers_sheet);

        for(Map.Entry<String,String> temp : quizscreen.answers.entrySet()){
            complete_answers += index + ". " + temp.getKey() + " - " +  temp.getValue() + "\n"
                    + "\n";
            index++;
        }

       questionText.setText(complete_answers);

        Button goToResults = (Button) findViewById(R.id.homebruh);
        goToResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(answerspage.this, homepageActivity.class);
                if (AdminPicked.music == 1) home.start();
                startActivity(intent);
                finish();
            }
        });
    }

}
