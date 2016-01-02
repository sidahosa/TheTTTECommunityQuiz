package com.example.xana.thetttecommunityquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Modified by MA 12/31 */

public class QuizActivity extends AppCompatActivity {

    TextView final_result;

    List<Questions> listofQuestions;
    int score = 0;
    int questionID = 0;
    Questions curr;
    TextView questionText;
    RadioButton button1, button2, button3, button4;
    Button gotoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DataBaseHelper dbhelper = new DataBaseHelper(this);

        listofQuestions = dbhelper.getEachQuestion();

        curr = listofQuestions.get(questionID);

        questionText = (TextView)findViewById(R.id.textView);
        button1 = (RadioButton)findViewById(R.id.radioButton);
        button2 = (RadioButton)findViewById(R.id.radioButton2);
        button3 = (RadioButton)findViewById(R.id.radioButton3);
        button4 = (RadioButton)findViewById(R.id.radioButton4);
        gotoNext = (Button)findViewById(R.id.goto_nextButton);
        setQuestionView();

        final_result = (TextView) findViewById(R.id.result);

        /*Hides TextView*/

        final_result.setEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setQuestionView() {

        questionText.setText(curr.askQuestion());

        ArrayList<String> arr = new ArrayList<String>();

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

        arr.clear();


    }

    public void chooseAnswer(View view) {


        boolean check = ((RadioButton) view).isChecked();

        /*Print specific messages for each case*/

        if (check) {

            switch (view.getId()) {

                case R.id.radioButton:
                    final_result.setText("Your chose CHOICE1");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton2:
                    final_result.setText("Your chose CHOICE2");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton3:
                    final_result.setText("Your chose CHOICE3");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton4:
                    final_result.setText("Your chose CHOICE4");
                    final_result.setEnabled(true);
                    break;

                case R.id.goto_nextButton:
                    final_result.setText("Going to next question...");
                    final_result.setEnabled(true);
                    curr = listofQuestions.get(questionID);
                    setQuestionView();
                    break;
            }

        } else {

            final_result.setEnabled(false);

        }

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
}