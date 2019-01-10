package com.example.aditi.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class display3 extends Activity {
   private Button btnclick;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layer3);
        btnclick= findViewById(R.id.button4);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i =  new Intent(display3.this,display4.class);
                startActivity(i);
            }
        });
    }
}
