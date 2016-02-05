package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

public class Results extends AppCompatActivity {
    private MediaPlayer theme = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.results_are_here);
        bg.setBackgroundResource(R.drawable.tracks1);

        final MediaPlayer home = MediaPlayer.create(this, R.raw.signal_change);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //get rating bar object
        TextView user_score = (TextView) findViewById(R.id.score_user);
        //get text view
        TextView t = (TextView) findViewById(R.id.textResult);
        ImageView iv1 = (ImageView) findViewById(R.id.prize);
        //get score

        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        //display score
        user_score.setText(score + "/" + AdminPicked.numberofquestions);

        String name = "Missing";
        switch (AdminPicked.selectedAdmin) {
            case 619:
                name = "Percyengine619";
                break;
            case 1:
                name = "Sidekickjason";
                break;
            case 199:
                name = "DieselD199";
                break;
            case 93:
                name = "Enterprisingengine93";
                break;
            case 4:
                name = "the admins";
                break;
        }
        if (AdminPicked.music == 1) {
            if (AdminPicked.numberofquestions == 5) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score < 3) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score >= 3 && score <= 5) {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            } else if (AdminPicked.numberofquestions == 10) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score <= 5) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score > 5 && score <= 10) {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            } else if (AdminPicked.numberofquestions == 15) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score < 10) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score >= 10 && score <= 15) {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            } else if (AdminPicked.numberofquestions == 20) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score <= 10) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score > 10 && score < 15) {
                    theme = MediaPlayer.create(this, R.raw.crash4);
                    theme.start();
                } else if (score >= 15 && score <= 20) {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            } else if (AdminPicked.numberofquestions == 25) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score <= 10) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score > 10 && score < 15) {
                    theme = MediaPlayer.create(this, R.raw.foghorn);
                    theme.start();
                } else if (score >= 15 && score <= 20) {
                    theme = MediaPlayer.create(this, R.raw.crash1);
                    theme.start();
                } else {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            } else if (AdminPicked.numberofquestions == 30) {
                if (score < 0) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_3);
                    theme.start();
                } else if (score >= 0 && score <= 10) {
                    theme = MediaPlayer.create(this, R.raw.trucks_laugh);
                    theme.start();
                } else if (score > 10 && score < 20) {
                    theme = MediaPlayer.create(this, R.raw.crash2);
                    theme.start();
                } else if (score >= 20 && score < 25) {
                    theme = MediaPlayer.create(this, R.raw.musiccue_2);
                    theme.start();
                } else if (score >= 25 && score <= 30) {
                    theme = MediaPlayer.create(this, R.raw.really_useful_engine);
                    theme.start();
                }
            }
        }

        Button goToResults = (Button) findViewById(R.id.continue_Button);
        goToResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Results.this, answerspage.class);
                if(AdminPicked.music == 1) home.start();
                startActivity(intent);
                if(theme != null) theme.release();
                finish();
            }
        });

        if (AdminPicked.numberofquestions == 5 && AdminPicked.selectedAdmin == 4) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about us...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing the admins!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                        t.setText("You aren't disappointing the admins anymore, but " +
                                "please try again");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums" +
                                "/a443/patsviper46/" +
                                "DuckTakesCharge31_zps5vn8b8vc.png").fit().centerCrop().into(iv1);
                        break;
                    case 3:
                        t.setText("You seem to know a little about the admins.");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/ThomasPercyandtheDragon7" +
                                "_zpsxp95qatx.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                        t.setText("You know a lot about all the admins.");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/ThomasPercyandOldSlowCoach70_" +
                                "zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                    case 5:
                        t.setText("Making the admins proud!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ThomasPercyandOldS" +
                                "lowCoach70_zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;

                }
            }
        }

        if (AdminPicked.numberofquestions == 5 && AdminPicked.selectedAdmin != 4) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about me....");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DieselsGhostlyChristmas207_zpswqxys3xd.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You can do a little better than that...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/BufferBother56_zpsjr1gix9h.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                        t.setText("Not bad... Not bad at all!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/" +
                                "a443/patsviper46/ThomasPercyandtheDragon7_" +
                                "zpsxp95qatx.png").fit().centerCrop().into(iv1);
                        break;
                    case 3:
                        t.setText("You  " +
                                "seem to know " + name + " very well!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums" +
                                "/a443/patsviper46/DuckTakesCharge31" +
                                "_zps5vn8b8vc.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                        t.setText(name + " regular sub!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/ThomasPercyandOldSlowCoach70_" +
                                "zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                    case 5:
                        t.setText("Ultimate " + name + " Fan Award!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ThomasPercyandOldS" +
                                "lowCoach70_zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }

        if (AdminPicked.numberofquestions == 10) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about " + name + "...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                    case 3:
                        t.setText("Try again for a better score!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/PercyTakesthePlunge24_" +
                                "zps1gg9jxcd.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                    case 5:
                        t.setText("You can do better than this!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/DirtyObjects17" +
                                "_zpsny4fjco0.png").fit().centerCrop().into(iv1);
                        break;
                    case 6:
                    case 7:
                        t.setText("You seem to know a decent amount about " + name + ".");
                        Picasso.with(this).load("http://i1036.photobucket.com" +
                                "/albums/a443/patsviper46/DirtyObjects12_" +
                                "zpsfu1kpq01.png").fit().centerCrop().into(iv1);
                        break;
                    case 8:
                    case 9:
                        t.setText("You seem to know a lot about all " + name + ".");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/ThomasandtheBreakdownTrain46_" +
                                "zpscbods6cb.png").fit().centerCrop().into(iv1);
                        break;
                    case 10:
                        t.setText("The knowledge is strong with you!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ThomasandtheGuardRS1_" +
                                "zps5xvi2pn7.png").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }

        if (AdminPicked.numberofquestions == 15) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about us...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                    case 3:
                        t.setText("Try again for a better score!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/PercyTakesthePlunge24_" +
                                "zps1gg9jxcd.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                    case 5:
                        t.setText("You can do better than this!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/DirtyObjects17" +
                                "_zpsny4fjco0.png").fit().centerCrop().into(iv1);
                        break;
                    case 6:
                        t.setText("Poor Percy!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/CrankyBugs19_" +
                                "zpskhjxzapp.png").fit().centerCrop().into(iv1);
                        break;
                    case 7:
                        t.setText("You are half way to a perfect score...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46" +
                                "/TobysTightrope1_zpseeyglxwj.png").fit().centerCrop().into(iv1);
                        break;
                    case 8:
                        t.setText("Not Bad, at least you know some things about " + name + ".");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/BowledOut12_" +
                                "zpsu6c1de7i.png").fit().centerCrop().into(iv1);
                        break;
                    case 9:
                    case 10:
                        t.setText("I heard about this tale this person and getting only a 9/15." + "\n" +
                                "Shut up! It's not funny.");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/Breakvan2_" +
                                "zpsrnpnzswj.png").fit().centerCrop().into(iv1);
                        break;
                    case 11:
                        t.setText("Choosing the Great Western Way Worked! Well Done!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ToadStandsBy37_" +
                                "zps2cemk0jv.png").fit().centerCrop().into(iv1);
                        break;
                    case 12:
                    case 13:
                        t.setText("You know a lot about " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/EmilySavestheWorld57_" +
                                "zps493qeqnv.png").fit().centerCrop().into(iv1);
                        break;
                    case 14:
                        t.setText("So close to perfection!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/JamesGetsaNewCoat30_" +
                                "zpsounfloce.png").fit().centerCrop().into(iv1);
                        break;
                    case 15:
                        t.setText("Are you majoring in The TTTE Community History?!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                                "ThomasPercyandOldSlowCoach70_" +
                                "zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }

        if (AdminPicked.numberofquestions == 20) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about " + name + "...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                    case 3:
                        t.setText("Try again for a better score!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/PercyTakesthePlunge24_" +
                                "zps1gg9jxcd.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                    case 5:
                        t.setText("You can do better than this!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/DirtyObjects17" +
                                "_zpsny4fjco0.png").fit().centerCrop().into(iv1);
                        break;
                    case 6:
                        t.setText("Poor Percy!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/CrankyBugs19_" +
                                "zpskhjxzapp.png").fit().centerCrop().into(iv1);
                        break;
                    case 7:
                        t.setText("Poor Toby!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums" +
                                "/a443/patsviper46/EmilyKnowsBest69_" +
                                "zpsqfurqkns.png").fit().centerCrop().into(iv1);
                        break;
                    case 8:
                        t.setText("Poor Duck stuck in the water!");
                        Picasso.with(this).load("http://photoresearch.beethomas." +
                                "com/wp-content/main/2011_10/DSC" +
                                "_0247.jpg").fit().centerCrop().into(iv1);
                        break;
                    case 9:
                        t.setText("Poor Donald!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/" +
                                "BreakVan2%201_zpseuvxm7fj.png").fit().centerCrop().into(iv1);
                        break;
                    case 10:
                        t.setText("Poor Douglas!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsvip" +
                                "er46/BreakVan14_zpsi1kk7zpo.png").fit().centerCrop().into(iv1);
                        break;
                    case 11:
                        t.setText("Poor Oliver!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/" +
                                "patsviper46/Escape11_zps5ekecpzz.png").fit().centerCrop().into(iv1);
                        break;
                    case 12:
                        t.setText("Poor Toad!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/" +
                                "BusyGoingBackwards89_zpsypbjtzth.png").fit().centerCrop().into(iv1);
                        break;
                    case 13:
                        t.setText("Poor Emily!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/patsviper46/" +
                                "EmilysRubbish12_zps1bkouozv.png").fit().centerCrop().into(iv1);
                        break;
                    case 14:
                        t.setText("Poor Stepney!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/RustytotheRescue35_" +
                                "zpsssijvbcu.png").fit().centerCrop().into(iv1);
                        break;
                    case 15:
                        t.setText("Choosing the Great Western Way Worked! Well Done!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ToadStandsBy37_" +
                                "zps2cemk0jv.png").fit().centerCrop().into(iv1);
                        break;
                    case 16:
                    case 17:
                        t.setText("You know a lot about " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/EmilySavestheWorld57_" +
                                "zps493qeqnv.png").fit().centerCrop().into(iv1);
                        break;
                    case 18:
                    case 19:
                        t.setText("So close to perfection!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/JamesGetsaNewCoat30_" +
                                "zpsounfloce.png").fit().centerCrop().into(iv1);
                        break;
                    case 20:
                        t.setText("Are you majoring in The TTTE Community History?!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                                "ThomasPercyandOldSlowCoach70_" +
                                "zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }

        if (AdminPicked.numberofquestions == 25) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about " + name + "...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                    case 3:
                        t.setText("Try again for a better score!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/PercyTakesthePlunge24_" +
                                "zps1gg9jxcd.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                    case 5:
                        t.setText("You can do better than this!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/DirtyObjects17" +
                                "_zpsny4fjco0.png").fit().centerCrop().into(iv1);
                        break;
                    case 6:
                        t.setText("Poor Percy!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/CrankyBugs19_" +
                                "zpskhjxzapp.png").fit().centerCrop().into(iv1);
                        break;
                    case 7:
                        t.setText("Poor Toby!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums" +
                                "/a443/patsviper46/EmilyKnowsBest69_" +
                                "zpsqfurqkns.png").fit().centerCrop().into(iv1);
                        break;
                    case 8:
                        t.setText("Poor Duck stuck in the water!");
                        Picasso.with(this).load("http://photoresearch.beethomas." +
                                "com/wp-content/main/2011_10/DSC" +
                                "_0247.jpg").fit().centerCrop().into(iv1);
                        break;
                    case 9:
                        t.setText("Poor Donald!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/" +
                                "BreakVan2%201_zpseuvxm7fj.png").fit().centerCrop().into(iv1);
                        break;
                    case 10:
                        t.setText("Poor Douglas!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsvip" +
                                "er46/BreakVan14_zpsi1kk7zpo.png").fit().centerCrop().into(iv1);
                        break;
                    case 11:
                        t.setText("Poor Oliver!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/" +
                                "patsviper46/Escape11_zps5ekecpzz.png").fit().centerCrop().into(iv1);
                        break;
                    case 12:
                        t.setText("Poor Toad!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/" +
                                "BusyGoingBackwards89_zpsypbjtzth.png").fit().centerCrop().into(iv1);
                        break;
                    case 13:
                        t.setText("Poor Emily!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/patsviper46/" +
                                "EmilysRubbish12_zps1bkouozv.png").fit().centerCrop().into(iv1);
                        break;
                    case 14:
                        t.setText("Poor Stepney!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/RustytotheRescue35_" +
                                "zpsssijvbcu.png").fit().centerCrop().into(iv1);
                        break;
                    case 15:
                        t.setText("Poor Paxton");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/" +
                                "DieselsGhostlyChristmas74_z" +
                                "ps0r9vj5vs.png").fit().centerCrop().into(iv1);
                        break;
                    case 16:
                        t.setText("Poor Neville");
                        Picasso.with(this).load("http://i1036.photobucket" +
                                ".com/albums/a443/patsviper46/" +
                                "ThomasAndTheNewEngine69_zpsibykzzea.png").fit().centerCrop().into(iv1);
                        break;
                    case 17:
                        t.setText("Poor Diesel");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/" +
                                "DieselsGhostlyChristmas207_" +
                                "zpswqxys3xd.png").fit().centerCrop().into(iv1);
                        break;
                    case 18:
                        t.setText("Not Bad!");
                        Picasso.with(this).load("http://i1036.photobucket.com" +
                                "/albums/a443/patsviper46/BowledOut12_" +
                                "zpsu6c1de7i.png").fit().centerCrop().into(iv1);
                        break;
                    case 19:
                        t.setText("You know a decent amount about " + name + ".");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/SpencersVIP39_" +
                                "zpseflkxlyv.png").fit().centerCrop().into(iv1);
                        break;
                    case 21:
                    case 20:
                    case 22:
                        t.setText("Wow, Great Moves! Keep up it! Proud of You!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/DuckTakesCharge31_" +
                                "zps5vn8b8vc.png").fit().centerCrop().into(iv1);
                        break;
                    case 23:
                        t.setText("Making all the admins proud with that score! " +
                                "Sir Topham Hatt has called you to give you a branch line");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ThomasPercyand" +
                                "OldSlowCoach70_zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                    case 24:
                        t.setText("So close to perfection!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DieselsGhostlyChristmas253_" +
                                "zpspefk5czp.png").fit().centerCrop().into(iv1);
                        break;
                    case 25:
                        t.setText("Are you one of the admins taking this quiz?");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/" +
                                "a443/patsviper46/ThomasandtheSpaceship68_" +
                                "zpsgx34nsvc.png").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }

        if (AdminPicked.numberofquestions == 30) {

            if (score < 0) {
                t.setText("You've shocked Gordon with your terrible score!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                        "RespectforGordon45_zps7llbq2qj.png").fit().
                        centerCrop().into(iv1);
            } else {
                switch (score) {
                    case 0:
                        t.setText("You don't know anything about " + name + "...");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/hqdefault_zpsm92xs8t8.jpg").fit().
                                centerCrop().into(iv1);
                        break;
                    case 1:
                        t.setText("You are disappointing " + name + "!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                                "patsviper46/DuckTakesCharge52_zps2icqg3xw.png").fit().
                                centerCrop().into(iv1);
                        break;
                    case 2:
                    case 3:
                        t.setText("Try again for a better score!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/PercyTakesthePlunge24_" +
                                "zps1gg9jxcd.png").fit().centerCrop().into(iv1);
                        break;
                    case 4:
                    case 5:
                        t.setText("You can do better than this!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/DirtyObjects17" +
                                "_zpsny4fjco0.png").fit().centerCrop().into(iv1);
                        break;
                    case 6:
                        t.setText("Poor Percy!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/CrankyBugs19_" +
                                "zpskhjxzapp.png").fit().centerCrop().into(iv1);
                        break;
                    case 7:
                        t.setText("Poor Toby!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums" +
                                "/a443/patsviper46/EmilyKnowsBest69_" +
                                "zpsqfurqkns.png").fit().centerCrop().into(iv1);
                        break;
                    case 8:
                        t.setText("Poor Duck stuck in the water!");
                        Picasso.with(this).load("http://photoresearch.beethomas." +
                                "com/wp-content/main/2011_10/DSC" +
                                "_0247.jpg").fit().centerCrop().into(iv1);
                        break;
                    case 9:
                        t.setText("Poor Donald!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/" +
                                "BreakVan2%201_zpseuvxm7fj.png").fit().centerCrop().into(iv1);
                        break;
                    case 10:
                        t.setText("Poor Douglas!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsv" +
                                "iper46/BreakVan14_zpsi1kk7zpo.png").fit().centerCrop().into(iv1);
                        break;
                    case 11:
                        t.setText("Poor Oliver!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/" +
                                "patsviper46/Escape11_zps5ekecpzz.png").fit().centerCrop().into(iv1);
                        break;
                    case 12:
                        t.setText("Poor Toad!");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/" +
                                "BusyGoingBackwards89_zpsypbjtzth.png").fit().centerCrop().into(iv1);
                        break;
                    case 13:
                        t.setText("Poor Emily!");
                        Picasso.with(this).load("http://i1036." +
                                "photobucket.com/albums/a443/patsviper46/" +
                                "EmilysRubbish12_zps1bkouozv.png").fit().centerCrop().into(iv1);
                        break;
                    case 14:
                        t.setText("Poor Stepney!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/RustytotheRescue35_" +
                                "zpsssijvbcu.png").fit().centerCrop().into(iv1);
                        break;
                    case 15:
                        t.setText("Poor Paxton");
                        Picasso.with(this).load("http://i1036.photobucket." +
                                "com/albums/a443/patsviper46/" +
                                "DieselsGhostlyChristmas74_z" +
                                "ps0r9vj5vs.png").fit().centerCrop().into(iv1);
                        break;
                    case 16:
                        t.setText("Poor Neville");
                        Picasso.with(this).load("http://i1036.photobucket" +
                                ".com/albums/a443/patsviper46/" +
                                "ThomasAndTheNewEngine69_zpsibykzzea.png").fit().centerCrop().into(iv1);
                        break;
                    case 17:
                        t.setText("Poor Diesel");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/" +
                                "DieselsGhostlyChristmas207_" +
                                "zpswqxys3xd.png").fit().centerCrop().into(iv1);
                        break;
                    case 18:
                        t.setText("Not Bad!");
                        Picasso.with(this).load("http://i1036.photobucket.com" +
                                "/albums/a443/patsviper46/BowledOut12_" +
                                "zpsu6c1de7i.png").fit().centerCrop().into(iv1);
                        break;
                    case 19:
                        t.setText("You know a decent amount about " + name + ".");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/SpencersVIP39_" +
                                "zpseflkxlyv.png").fit().centerCrop().into(iv1);
                        break;
                    case 21:
                    case 20:
                    case 22:
                        t.setText("Wow, Great Moves! Keep up it! Proud of You!");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/DuckTakesCharge31_" +
                                "zps5vn8b8vc.png").fit().centerCrop().into(iv1);
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        t.setText("Making all the admins proud with that score! " +
                                "Sir Topham Hatt has called you to give you a branch line");
                        Picasso.with(this).load("http://i1036.photobucket.com/" +
                                "albums/a443/patsviper46/ThomasPercyand" +
                                "OldSlowCoach70_zpsarlts2ih.png").fit().centerCrop().into(iv1);
                        break;
                    case 27:
                    case 28:
                    case 29:
                        t.setText("We must be one of the first people to " +
                                "join the TTTE Community remakes!");
                        Picasso.with(this).load("http://i1036.photobucket.com/albums/" +
                                "a443/patsviper46/ThomasandGordon26_" +
                                "zpsav76zj3q.png").fit().centerCrop().into(iv1);
                        break;
                    case 30:
                        t.setText("Perfect! (Cell From Dragon Ball Z, if you get the reference" +
                                "tweet to @tttecommunity or @Percyengine619 a screenshot of this page!");
                        Picasso.with(this).load("http://a1.fanbread.com/uploads/image/file/" +
                                "2094/9.gif?a5c6224b58e4a25892c2ff13ad" +
                                "2498b5").fit().centerCrop().into(iv1);
                        break;
                }
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
    }

}
