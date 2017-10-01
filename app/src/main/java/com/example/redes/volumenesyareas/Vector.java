package com.example.redes.volumenesyareas;

import java.util.ArrayList;

/**
 * Created by Redes on 29/09/2017.
 */

public class Vector {
    private static ArrayList<OpeRealizadas> operaciones = new ArrayList<>();

    public static void SalvarCambios (OpeRealizadas ops) {

        operaciones.add(ops);
    }

    public static ArrayList<OpeRealizadas> getOperaciones(){
        return operaciones;
    }
}
