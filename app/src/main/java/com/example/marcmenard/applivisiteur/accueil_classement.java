package com.example.marcmenard.applivisiteur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class accueil_classement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_classement);

        final ListView contentGR = (ListView) findViewById(R.id.contentGR);

        Button buttonGR = (Button) findViewById(R.id.buttongr);
        buttonGR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contentGR.setVisibility(View.INVISIBLE);
            }
        });

    }
}
