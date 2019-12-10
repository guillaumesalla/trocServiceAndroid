package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConnexionActivity extends AppCompatActivity {

    private Button buttonMenu;
    private Button creerTroc;
    private Button mesTrocs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        this.buttonMenu = (Button) findViewById(R.id.buttonMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu);
                finish();
            }
        });

        this.creerTroc = (Button) findViewById(R.id.buttonCreerUnTroc);
        creerTroc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creerTroc = new Intent(getApplicationContext(), CreerUnTroc.class);
                startActivity(creerTroc);
                finish();
            }
        });

        this.mesTrocs = (Button) findViewById(R.id.buttonMesTrocs);
        mesTrocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mesTrocs = new Intent(getApplicationContext(), MesTrocs.class);
                startActivity(mesTrocs);
                finish();
            }
        });
    }
}
