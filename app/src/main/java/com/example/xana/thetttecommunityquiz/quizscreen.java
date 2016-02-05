package com.example.xana.thetttecommunityquiz;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class quizscreen extends Activity {

    // TextView final_result;
    RadioButton button1, button2, button3, button4;

    List<Questions> listofQuestions;
    int score = 0;
    int questionID = 0;
    Questions curr;
    TextView questionText;
    ImageButton gotoNext;
    MediaPlayer theme;
    int length;
    public static TreeMap <String, String> answers = new TreeMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizscreen);
        final RelativeLayout changingBg = (RelativeLayout) findViewById(R.id.quiz_bg);

        DataBaseHelper dbHepler = new DataBaseHelper(this);

    /* Based on what button (Admin) the user selects,
        they will be prompted questions on that said admin */

        if (AdminPicked.selectedAdmin == 199) {
            listofQuestions = dbHepler.getAllDieselD199Questions();
            changingBg.setBackgroundResource(R.drawable.d199_bg);
            if(AdminPicked.music == 1){
                theme = MediaPlayer.create(quizscreen.this, R.raw.d199_theme);
                theme.start();
                theme.setLooping(true);
            }

        } else if (AdminPicked.selectedAdmin == 93) {
            listofQuestions = dbHepler.getAllEE93Questions();

            if(AdminPicked.music == 1){
                theme = MediaPlayer.create(quizscreen.this, R.raw.ee93_theme);
                theme.start();
                theme.setLooping(true);
            }
        } else if (AdminPicked.selectedAdmin == 619) {
            listofQuestions = dbHepler.getAllPe619Questions();

            switch(AdminPicked.numberofquestions){
                case 5:
                case 10: changingBg.setBackgroundResource(R.drawable.pe619_bg1);
                    break;
                case 15:
                case 20: changingBg.setBackgroundResource(R.drawable.pe619_bg2);
                    break;
                case 25:
                case 30: changingBg.setBackgroundResource(R.drawable.pe619_bg3);
                    break;
            }

            if (AdminPicked.music == 1) {
                switch (AdminPicked.numberofquestions) {
                    case 5:
                        theme = MediaPlayer.create(quizscreen.this, R.raw.pe619_5_questions);
                        theme.start();
                        theme.setLooping(true);
                        break;
                    case 10:
                    case 15:
                        theme = MediaPlayer.create(quizscreen.this, R.raw.pe619_10_15);
                        theme.start();
                        theme.setLooping(true);
                        break;
                    case 20:
                    case 25:
                    case 30:
                        theme = MediaPlayer.create(quizscreen.this, R.raw.pe619_questions_20_30);
                        theme.start();
                        theme.setLooping(true);
                        break;
                }
            }

        } else if (AdminPicked.selectedAdmin == 1) {
            listofQuestions = dbHepler.getAllSKJQuestions();
            changingBg.setBackgroundResource(R.drawable.skj_background);

            if(AdminPicked.music == 1){

                theme = MediaPlayer.create(quizscreen.this, R.raw.skj_theme);
                theme.start();
                theme.setLooping(true);
            }

        } else if (AdminPicked.selectedAdmin == 4) {
            listofQuestions = dbHepler.getAllAdminsQuestions();
            changingBg.setBackgroundResource(R.drawable.tracks1);

            if(AdminPicked.music == 1){
                theme = MediaPlayer.create(quizscreen.this, R.raw.trying_ttte_theme);
                theme.start();
                theme.setLooping(true);
            }
        }

        curr = listofQuestions.get(questionID);
        questionText = (TextView) findViewById(R.id.textView);

        button1 = (RadioButton)findViewById(R.id.radioButton);
        button2 = (RadioButton)findViewById(R.id.radioButton2);
        button3 = (RadioButton)findViewById(R.id.radioButton3);
        button4 = (RadioButton)findViewById(R.id.radioButton4);

        gotoNext = (ImageButton)findViewById(R.id.next_button);

        setQuestionView();

        gotoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup grp = (RadioGroup) findViewById(R.id.radioBro);
                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                Log.d("your ans", curr.getCorrectanswer() + " " + answer.getText());


                if (curr.getCorrectanswer().equals(answer.getText())) {
                    score++;
                    Log.d("score", "Your score" + score);
                } else {
                    if(AdminPicked.negative_points_mode == -1) score--;
                }
                if(questionID < AdminPicked.numberofquestions){
                    curr = listofQuestions.get(questionID);
                    setQuestionView();
                }else{
                   endGame();
                }


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setQuestionView() {

        questionText.setText(curr.askQuestion());

        ArrayList<String> arr = new ArrayList<>();

        arr.add(curr.getCorrectanswer());
        arr.add(curr.getFalseanswer1());
        arr.add(curr.getFalseanswer2());
        arr.add(curr.getFalseanswer3());

        Collections.shuffle(arr);

        button1.setText(arr.get(0));
        button2.setText(arr.get(1));
        button3.setText(arr.get(2));
        button4.setText(arr.get(3));
        questionID++;

        //Answers to the questions
        if(AdminPicked.numberofquestions == 5 || AdminPicked.numberofquestions == 10){
            answers.put(curr.askQuestion(), curr.getCorrectanswer());
        } else {
            answers = null;
        }

        arr.clear();
    }

    private void endGame(){
        Intent intent = new Intent(getApplicationContext(), Results.class);
        Bundle b = new Bundle();
        b.putInt("score", score); //Your score
        intent.putExtras(b); //Put your score to your next Intent
        if(theme != null) {
            theme.release();
        }
        //listofQuestions.clear();
        startActivity(intent);
        finish();
    }

    @Override
    public void onPause(){
        super.onPause();

        if (questionID == AdminPicked.numberofquestions){
            endGame();
        } else {
            if (theme != null) {
                theme.pause();
                length = theme.getCurrentPosition();
            }
        }

    }

    @Override
    public void onResume(){
        super.onResume();
        if(theme != null) {
            theme.seekTo(length);
            theme.start();
        }
    }

}
