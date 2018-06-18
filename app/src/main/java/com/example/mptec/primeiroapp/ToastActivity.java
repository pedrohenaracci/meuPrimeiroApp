package com.example.mptec.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        final EditText campoedit = (EditText) findViewById(R.id.campoedit);

        Button botaotoast = (Button) findViewById(R.id.botaotoast);
        Button botaoex2 = (Button) findViewById(R.id.botaoex2);

        botaotoast.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), campoedit.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        botaoex2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(ToastActivity.this, CorTextoActivity.class);
                startActivity(it);

            }
        });

    }
}
