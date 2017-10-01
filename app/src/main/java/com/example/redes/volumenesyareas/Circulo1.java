package com.example.redes.volumenesyareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo1 extends AppCompatActivity {

    private EditText Radio;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo1);
        Radio = (EditText)findViewById(R.id.txtCajaRadio);
        i = new Intent(this, Cuadrado2.class);
        b = new Bundle();
    }

    public void Circulo1 (View v){
        double num,total;
        double pi = 3.1416;
        String operacion="", dato="";
        num = Double.parseDouble((Radio.getText().toString()));
        total = (num * num)*pi;
        String t2=""+total;
        dato = "Radio: " +Radio.getText().toString();
        operacion = "Area del Circulo";

        b.putDouble("Area", total);
        i.putExtras(b);
        OpeRealizadas or = new OpeRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void Borrar (View v){
        Radio.setText("");
        Radio.requestFocus();
    }
}
