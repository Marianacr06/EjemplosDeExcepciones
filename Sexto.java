/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac java.lang.NullPointerException: Se produce cuando se intenta
 * acceder a un objeto que es null.
 */
public class Sexto {

    public static void main(String[] args) {
        // Creamos una referencia a un objeto que es null
        String str = null;

        // Verificamos si la cadena no es null antes de llamar al método length()
        if (str != null) {
            int longitud = str.length(); // Esto lanzará una excepción NullPointerException
            System.out.println("La longitud de la cadena es: " + longitud);
        } else {
            System.out.println("La cadena es null.");
        }
    }
}

/**
 *
 * En este ejemplo, la variable str se inicializa como null, lo que significa
 * que no hace referencia a ningún objeto. Luego, intentamos llamar al método
 * length() en esta referencia nula, lo que resultará en una excepción
 * NullPointerException.
 */
