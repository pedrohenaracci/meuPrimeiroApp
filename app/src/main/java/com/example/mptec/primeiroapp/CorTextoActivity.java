package com.example.mptec.primeiroapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CorTextoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cor_texto);

        final EditText campoedit = (EditText) findViewById(R.id.campoedit);

        Button botaomudacor = (Button) findViewById(R.id.botaomudacor);
        Button botaoex1 = (Button) findViewById(R.id.botaoex1);

        botaomudacor.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                campoedit.setTextColor(Color.parseColor("##FF1493"));

            }
        });

        botaoex1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(CorTextoActivity.this,ToastActivity.class);
                startActivity(it);

            }
        });
    }
}
