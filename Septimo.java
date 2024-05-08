/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac java.lang.ArrayIndexOutOfBoundsException: Se produce cuando se
 * intenta acceder a un índice fuera del rango válido de un arreglo. ejemplo
 * sencillo
 */
public class Septimo {

    public static void main(String[] args) {
        // Creamos un arreglo de tamaño 3
        int[] arreglo = new int[3];

        // Intentamos acceder a un índice fuera del rango válido del arreglo
        int valor = arreglo[5]; // Esto lanzará una excepción ArrayIndexOutOfBoundsException
        System.out.println("El valor en la posición 5 es: " + valor);
    }
}
/**
 *
 * En este ejemplo, estamos intentando acceder al elemento en la posición 5 de
 * un arreglo que solo tiene tres elementos. Esto está fuera del rango válido
 * del arreglo, lo que resultará en una excepción
 * java.lang.ArrayIndexOutOfBoundsException.
 */
