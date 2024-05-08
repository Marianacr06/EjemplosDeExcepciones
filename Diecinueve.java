/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mac
 *
 * java.text.ParseException: Se produce cuando ocurre un error al analizar
 * (convertir) una cadena en un formato de fecha, hora u otro formato
 * específico.
 */
public class Diecinueve {

    public static void main(String[] args) {
        // Creamos un formato de fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Intentamos analizar una cadena en un formato de fecha incorrecto
            String cadenaFecha = "2024-05-06";
            Date fecha = formatoFecha.parse(cadenaFecha);
        } catch (java.text.ParseException e) {
            // Capturamos la excepción ParseException si ocurre
            System.out.println("Se ha producido un error al analizar la fecha: " + e.getMessage());
        }
    }

}

/**
 *
 * En este ejemplo, estamos intentando analizar la cadena "2024-05-06" en un
 * formato de fecha "dd/MM/yyyy" utilizando SimpleDateFormat.parse(). Sin
 * embargo, la cadena no coincide con el formato esperado, lo que provocará una
 * excepción java.text.ParseException. La salida podría verse así: Se ha
 * producido un error al analizar la fecha: Unparseable date: "2024-05-06"
 *
 */
