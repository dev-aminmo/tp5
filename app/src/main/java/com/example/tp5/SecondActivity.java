package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent myIntent = getIntent();
        String nom = myIntent.getStringExtra("nomKey");
        String prenom= myIntent.getStringExtra("prenomKey");
        EditText nomEdit   = (EditText)findViewById(R.id.nom);
        EditText prenomEdit   = (EditText)findViewById(R.id.prenom);
        nomEdit.setText(prenom);
        prenomEdit.setText(nom);

    }
}