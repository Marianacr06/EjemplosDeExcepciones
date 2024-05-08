/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * IllegalArgumentException que es Se produce para indicar que se ha pasado un
 * método a un argumento no válido o inadecuado.
 */
public class Trientacinco {

    public static void main(String[] args) {

        //Supongamos que tenemos una enumeración Mes
        enum Mes {
            Enero, Junio, Octubre
        }
        // Supongamos que se obtiene un valor de una fuente externa
        String mesName = "Noviembre";

        try {
            Mes mes = Mes.valueOf(mesName); // Intentar obtener el valor de la enumeración
            System.out.println("Mes seleccionado: " + mes);
        } catch (IllegalArgumentException e) {
            // Manejar el caso en que el valor de la enumeración no existe
            System.err.println("Mes no válido: " + mesName);
        }
    }

}
/**
 *
 * este código muestra cómo manejar la situación en la que se intenta obtener un
 * valor de una enumeración a partir de una cadena que no corresponde a ningún
 * valor en la enumeración, utilizando un bloque try-catch para capturar la
 * excepción IllegalArgumentException que se lanza en dicho caso.
 */
