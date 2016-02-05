package com.example.xana.thetttecommunityquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/*this was previously named "homepage.xml" but was modified by MA*/

public class homepageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        final MediaPlayer sound_theme = MediaPlayer.create(this, R.raw.signal_change);
        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.homepage_bg);
        bg.setBackgroundResource(R.drawable.home3);

        Button select = (Button) findViewById(R.id.play_now);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selection.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                if (AdminPicked.music == 1) {
                    sound_theme.start();
                }
                bg.destroyDrawingCache();
                startActivity(intent);
                finish();

            }
        });
    }

    public void goToSubscribe(View view) {
        goToUrl("https://www.youtube.com/channel/UCoh1Faq38vyB4edjnG3J6xQ");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
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

    @Override
    public void onPause(){
        super.onPause();
        this.finish();
    }
}
