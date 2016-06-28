package com.hemantdave.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MoodBasedTracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_based_tracks);
        Button moreSongs=(Button)findViewById(R.id.moreButton);
        assert moreSongs!=null;
        moreSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),BrowseMoreActivity.class);
                startActivity(i);
            }
        });
    }
    public void finish(View v){
        finish();
    }
}
