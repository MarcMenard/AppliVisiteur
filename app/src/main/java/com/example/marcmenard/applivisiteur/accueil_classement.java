package com.example.marcmenard.applivisiteur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class accueil_classement extends AppCompatActivity {

    ListView mListView;

    String[] values = new String[]{
            "Koala", "Pingouins"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_classement);

        mListView = (ListView) findViewById(R.id.listView);

        AdapteurDeListeGroupeAcl adaptateur = new AdapteurDeListeGroupeAcl(this, values);
        mListView.setAdapter(adaptateur);

    }

    protected void onListItemClick(ListView mListView, View v, int position, long id) {
        Toast.makeText(this, "Position : " + position, Toast.LENGTH_LONG).show();
    }
}
