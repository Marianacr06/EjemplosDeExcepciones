/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.NumberFormatException: Se produce cuando se intenta convertir una
 * cadena en un formato numérico incorrecto, como convertir una cadena no
 * numérica en un tipo numérico.
 */
public class Diecisiete {

    public static void main(String[] args) {
        try {
            // Intentamos convertir una cadena no numérica en un entero
            String cadenaNoNumerica = "Hola Mundo";
            int numero = Integer.parseInt(cadenaNoNumerica);
        } catch (NumberFormatException e) {
            // Capturamos la excepción NumberFormatException si ocurre
            System.out.println("Se ha producido un error de formato numérico: " + e.getMessage());
        }
    }
}
/**
 *
 * En este ejemplo, estamos intentando convertir la cadena "Hola Mundo" en un
 * entero utilizando Integer.parseInt(), lo cual provocará una excepción
 * java.lang.NumberFormatException porque la cadena no representa un número
 * válido. La salida podría verse así: Se ha producido un error de formato
 * numérico: For input string: "Hola Mundo"
 *
 */
