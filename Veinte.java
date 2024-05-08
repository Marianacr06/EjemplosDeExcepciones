/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 *
 * java.lang.ClassCastException: Se produce cuando se intenta realizar una
 * conversión de tipo incompatible, especialmente al trabajar con herencia y
 * polimorfismo.
 */
public class Veinte {

    public static void main(String[] args) {
        // Creamos una lista de objetos
        Object obj = "Hola Mundo";

        try {
            // Intentamos convertir el objeto a un tipo incompatible
            Integer numero = (Integer) obj;
        } catch (ClassCastException e) {
            // Capturamos la excepción ClassCastException si ocurre
            System.out.println("Se ha producido un error de conversión de tipo: " + e.getMessage());
        }
    }
}
/**
 *
 * En este ejemplo, tenemos un objeto de tipo String asignado a una variable de
 * tipo Object. Luego, intentamos convertir este objeto a un Integer, lo cual es
 * incompatible y provocará una excepción java.lang.ClassCastException. La
 * salida podría verse así:Se ha producido un error de conversión de tipo:
 * java.lang.String cannot be cast to java.lang.Integer
 */
