package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button mButton = (Button)findViewById(R.id.button);
       EditText nomEdit   = (EditText)findViewById(R.id.nom);
       EditText prenomEdit   = (EditText)findViewById(R.id.prenom);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(MainActivity.this ,SecondActivity.class);
                        intent.putExtra("nomKey",nomEdit.getText().toString());
                        intent.putExtra("prenomKey",prenomEdit.getText().toString());
                        startActivity(intent);
                    }
                });
    }
}