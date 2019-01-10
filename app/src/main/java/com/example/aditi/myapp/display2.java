package com.example.aditi.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class display2 extends Activity {
    private Button btnclick;
    @Override

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layer2);
        btnclick= findViewById(R.id.button3);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i =  new Intent(display2.this,display3.class);
                startActivity(i);
            }
        });
    }
}
