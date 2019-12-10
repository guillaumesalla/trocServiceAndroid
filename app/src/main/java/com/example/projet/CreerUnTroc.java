package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreerUnTroc extends AppCompatActivity {

    private Button buttonMenu;
    private Button creerTroc;
    private Button mesTrocs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_un_troc);

        this.buttonMenu = (Button) findViewById(R.id.buttonMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        this.mesTrocs = (Button) findViewById(R.id.buttonMesTrocs);
        mesTrocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MesTrocs.class);
                startActivity(i);
                finish();
            }
        });

        this.creerTroc = (Button) findViewById(R.id.buttonCreerUnTroc);
        creerTroc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CreerUnTroc.class);
                startActivity(i);
                finish();
            }
        });


    }
}
