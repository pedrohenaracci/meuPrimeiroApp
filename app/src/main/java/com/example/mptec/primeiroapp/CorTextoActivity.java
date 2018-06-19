package com.example.mptec.primeiroapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.mptec.primeiroapp.R.*;

public class CorTextoActivity extends AppCompatActivity {

    EditText campoedit;
    Button botaomudacor;
    Button botaoex1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_cor_texto);

        campoedit = (EditText) findViewById(R.id.campoedit);
        botaomudacor = (Button) findViewById(id.botaomudacor);
        botaoex1 = (Button) findViewById(R.id.botaoex1);

        botaomudacor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MudaCor();

            }
        });

        botaoex1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(CorTextoActivity.this,ToastActivity.class);
                startActivity(it);

            }
        });
    }

    public void MudaCor(){
        campoedit.setTextColor(ContextCompat.getColorStateList(this, color.corRosaLegal));
    }
}
