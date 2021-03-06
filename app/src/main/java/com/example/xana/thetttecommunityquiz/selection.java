package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        //AdminPicked.music = 1;
        final MediaPlayer pressedon = MediaPlayer.create(this, R.raw.guard_whistle);
        final Button sounds = (Button) findViewById(R.id.sound);
        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.select_admin);
        bg.setBackgroundResource(R.drawable.selection1);

        sounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( AdminPicked.music == 1) {
                    sounds.setBackgroundColor(Color.RED);
                    AdminPicked.music = 0;
                } else if (AdminPicked.music == 0){
                    AdminPicked.music = 1;
                    sounds.setBackgroundResource(R.drawable.bg_button);
                }
            }
        });

        final Button neg = (Button) findViewById(R.id.negative);
        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( AdminPicked.negative_points_mode == 1) {
                    neg.setBackgroundColor(Color.RED);
                    AdminPicked.negative_points_mode = -1;
                } else if (AdminPicked.negative_points_mode == -1){
                    AdminPicked.negative_points_mode = 1;
                    neg.setBackgroundResource(R.drawable.bg_button);
                }
            }
        });

         /* Takes the user to screen to select the number of questions they want */

        Button selectd199 = (Button) findViewById(R.id.d199startquiz);
        selectd199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdiff.class);
                startActivity(intent);
                if (AdminPicked.music == 1) pressedon.start();
                AdminPicked.selectedAdmin = 199;
                finish();
            }
        });

        Button selectalladmins = (Button) findViewById(R.id.allstartquiz);
        selectalladmins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 4;
                if (AdminPicked.music == 1) pressedon.start();
                finish();
            }
        });

        Button selectee93 = (Button) findViewById(R.id.ee93startquiz);
        selectee93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 93;
                if (AdminPicked.music == 1){ pressedon.start();}
                finish();
            }
        });

        Button selectpe619 = (Button) findViewById(R.id.pe619startquiz);
        selectpe619.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 619;
                if (AdminPicked.music == 1){ pressedon.start(); }
                finish();
            }
        });

        Button selectskj = (Button) findViewById(R.id.skjstartquiz);
        selectskj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 1;
                if (AdminPicked.music == 1){ pressedon.start(); }
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
