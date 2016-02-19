package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Map;
import java.util.TreeMap;

public class answerspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answerspage);

        TextView questionText;
        String complete_answers = "";
        int index = 1;

        final MediaPlayer home = MediaPlayer.create(this, R.raw.signal_change);
        questionText = (TextView) findViewById(R.id.answers_sheet);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        if (quizscreen.answers != null ) {
            for (Map.Entry<String, String> temp : quizscreen.answers.entrySet()) {
                complete_answers += index + ". " + temp.getKey() + " - " + temp.getValue() + "\n"
                        + "\n";
                index++;
            }
            questionText.setText(complete_answers);
        } else {
            questionText.setText("For Normal, Hard, Very Hard, and Challenge Mode, " +
                    "the answers will not appear.");
        }



        Button goToResults = (Button) findViewById(R.id.homebruh);
        goToResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), homepageActivity.class);
                if (AdminPicked.music == 1) home.start();
                startActivity(intent);
                if ( quizscreen.answers != null) quizscreen.answers.clear();
                else quizscreen.answers = new TreeMap<String, String>();
                AdminPicked.negative_points_mode = 1;
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
    }

}
