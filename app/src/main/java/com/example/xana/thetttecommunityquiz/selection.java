package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

         /* Takes the user to screen to select the number of questions they want */

        Button selectd199 = (Button) findViewById(R.id.d199startquiz);
        selectd199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, selectdiff.class);
                selection.this.finish();
                startActivity(intent);
                AdminPicked.selectedAdmin = 199;
            }
        });

        Button selectalladmins = (Button) findViewById(R.id.allstartquiz);
        selectalladmins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 4;
                selection.this.finish();
            }
        });

        Button selectee93 = (Button) findViewById(R.id.ee93startquiz);
        selectee93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 93;
                selection.this.finish();
            }
        });

        Button selectpe619 = (Button) findViewById(R.id.pe619startquiz);
        selectpe619.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 619;
                selection.this.finish();
            }
        });

        Button selectskj = (Button) findViewById(R.id.skjstartquiz);
        selectskj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, selectdiff.class);
                startActivity(intent);
                AdminPicked.selectedAdmin = 1;
                selection.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(selection.this, homepageActivity.class);
        startActivity(intent);
    }

}
