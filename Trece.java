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
 * java.lang.IndexOutOfBoundsException: Se produce cuando se intenta acceder a
 * un índice fuera del rango válido, tanto para arreglos como para colecciones.
 */
public class Trece {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3};

        try {
            // Intentamos acceder a un índice fuera del rango del arreglo
            int valor = arreglo[5];
        } catch (IndexOutOfBoundsException e) {
            // Capturamos la excepción IndexOutOfBoundsException si ocurre
            System.out.println("Se ha producido un error de índice fuera de rango: " + e.getMessage());
        }
    }
}
/**
 *
 *
 *
 * En este ejemplo, estamos intentando acceder al índice 5 del arreglo arreglo,
 * que solo tiene elementos en los índices 0, 1 y 2. Por lo tanto, se lanzará un
 * java.lang.IndexOutOfBoundsException. La salida podría verse así: Se ha
 * producido un error de índice fuera de rango: Index 5 out of bounds for length
 * 3
 */
