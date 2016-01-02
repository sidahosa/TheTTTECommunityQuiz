package com.example.xana.thetttecommunityquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/* Modified by MA 12/31 */

public class QuizActivity extends AppCompatActivity {

    TextView final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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