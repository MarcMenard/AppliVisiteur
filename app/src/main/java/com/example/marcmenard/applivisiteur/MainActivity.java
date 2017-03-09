package com.example.marcmenard.applivisiteur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCL = (Button) findViewById(R.id.button6);
        buttonCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, accueil_classement.class);
                startActivity(intent);
            }
        });

        Button buttonPL = (Button) findViewById(R.id.button20);
        buttonPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, planning_general.class);
                startActivity(intent);
            }
        });
    }
}
