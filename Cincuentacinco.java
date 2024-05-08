/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 *
 * @author mac 
 * java.util.EmptyEnumerationException: Se produce cuando se intenta
 * acceder a un elemento de una enumeración vacía.
 */
public class Cincuentacinco {

    public static void main(String[] args) {
        // Crear una enumeración vacía
        Vector<String> vector = new Vector<>();
        Enumeration<String> enumeration = vector.elements();

        // Intentar acceder a un elemento de la enumeración
        try {
            String element = enumeration.nextElement();
            System.out.println("Elemento: " + element);
        } catch (NoSuchElementException e) {
            System.err.println("La enumeración está vacía: " + e.getMessage());
        }
    }
}
/**
 *
 * En este ejemplo, se crea un Vector vacío y se obtiene una enumeración de sus
 * elementos. Luego, se intenta acceder a un elemento de la enumeración
 * utilizando nextElement(). Si la enumeración está vacía, se lanzará una
 * NoSuchElementException, y se captura y maneja esta excepción adecuadamente.
 * Esto es similar a lo que sucedería si se intentara acceder a un elemento de
 * una enumeración vacía en Java.
 */
