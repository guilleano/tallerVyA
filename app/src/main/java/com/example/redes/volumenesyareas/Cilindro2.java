package com.example.redes.volumenesyareas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cilindro2 extends AppCompatActivity {

    private TextView total;
    private double c;
    private String aux;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro2);

        total = (TextView) findViewById(R.id.txtCajaResultado);
        b = getIntent().getExtras();
        c = b.getDouble("Area");
        aux = ""+c;
        total.setText(aux);
    }

    public void VolverCilindro (View v){
        i = new Intent(this, Cilindro1.class);
        startActivity(i);
    }
}
