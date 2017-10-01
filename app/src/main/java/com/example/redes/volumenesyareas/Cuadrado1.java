package com.example.redes.volumenesyareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cuadrado1 extends AppCompatActivity {
    private EditText Lado;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado1);

        Lado = (EditText) findViewById(R.id.cajLado);
        i = new Intent(this, Cuadrado2.class);
        b = new Bundle();
    }

    public void AlCuadrado (View v){
        double num, total;
        String operacion="", dato="";
        num = Double.parseDouble((Lado.getText().toString()));
        total = num * num;
        String t2=""+total;
        dato = "Lado: " +Lado.getText().toString();
        operacion = "Area del Cuadrado";

        b.putDouble("Area", total);
        i.putExtras(b);
        OpeRealizadas or = new OpeRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void Borrar (View v){
        Lado.setText("");
        Lado.requestFocus();
    }

    public void Validar(View v){

    }
}
