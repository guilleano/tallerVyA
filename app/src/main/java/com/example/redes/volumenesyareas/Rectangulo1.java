package com.example.redes.volumenesyareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rectangulo1 extends AppCompatActivity {
    private EditText Base,Altura;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo1);

        Base = (EditText) findViewById(R.id.cajaBase);
        Altura = (EditText)findViewById(R.id.cajaAltura);
        i = new Intent(this, Rectangulo2.class);
        b = new Bundle();
    }

    public void Rectangulo1 (View v){
        double base,altura, total;
        String operacion="", dato="";
        base = Double.parseDouble((Base.getText().toString()));
        altura = Double.parseDouble(Altura.getText().toString());
        total = base * altura;
        String t2 = ""+total;
        dato = "Base: "+ Base.getText().toString()+ ", " + "\nAltura: "+ Altura.getText().toString();
        operacion = "Area del Rectangulo";

        b.putDouble("Area", total);
        i.putExtras(b);
        OpeRealizadas or = new OpeRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void Borrar (View v){
        Base.setText("");
        Base.requestFocus();
        Altura.setText("");
        Altura.requestFocus();
    }
}
