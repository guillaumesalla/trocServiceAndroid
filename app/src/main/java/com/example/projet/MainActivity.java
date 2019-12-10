package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonConnexion;
    private TextView creerCompte;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonConnexion = (Button) findViewById(R.id.buttonConnexion);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionActivity = new Intent(getApplicationContext(), ConnexionActivity.class);
                startActivity(connexionActivity);
                finish();
            }
        });

        this.creerCompte = (TextView) findViewById(R.id.textViewCreerCompte);
        creerCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creerCompte = new Intent(getApplicationContext(), CreerCompte.class);
                startActivity(creerCompte);
                finish();
            }
        });
    }
}
