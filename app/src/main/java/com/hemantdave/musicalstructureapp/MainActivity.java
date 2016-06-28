package com.hemantdave.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button topFiftyTracks=(Button)findViewById(R.id.topFiftyTracks);
        Button moodBasedTracks=(Button)findViewById(R.id.moodBasedTracks);
        Button radioHits=(Button)findViewById(R.id.radioHits);
        Button podcasts=(Button)findViewById(R.id.podcasts);
        Button browseMore=(Button)findViewById(R.id.browseMore);

        /*Setting OnclickListeners*/


        topFiftyTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TopFiftyTracksActivity.class);
                startActivity(i);
            }
        });

        moodBasedTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MoodBasedTracks.class);
                startActivity(i);
            }
        });

        radioHits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RadioHitsActivity.class);
                startActivity(i);
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),PodcastsActivity.class);
                startActivity(i);
            }
        });


        browseMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),BrowseMoreActivity.class);
                startActivity(i);
            }
        });

    }
}
