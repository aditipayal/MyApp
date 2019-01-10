package com.example.aditi.myapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;
    private Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysong = MediaPlayer.create(MainActivity.this,R.raw.ytshbh);
        btnclick= findViewById(R.id.button);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mysong.start();
                Intent i =  new Intent(MainActivity.this,display.class);
                startActivity(i);
            }
        });
    }
}
