package com.example.redes.volumenesyareas;

/**
 * Created by Redes on 29/09/2017.
 */

public class OpeRealizadas {
    private String Operaciones,resultados,datos;


    public OpeRealizadas(String operaciones, String resultados, String datos) {
        this.Operaciones = operaciones;
        this.resultados = resultados;
        this.datos = datos;
    }
    public String getOperaciones() {

        return Operaciones;
    }

    public void setOperaciones(String operaciones) {

        Operaciones = operaciones;
    }

    public String getResultados() {

        return resultados;
    }

    public void setResultados(String resultados) {

        this.resultados = resultados;
    }

    public String getDatos() {

        return datos;
    }

    public void setDatos(String datos) {

        this.datos = datos;
    }

    public void SalvarCambios(){

        Vector.SalvarCambios(this);
    }
}

