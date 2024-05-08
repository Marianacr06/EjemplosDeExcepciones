/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mac
 *
 * java.util.ConcurrentModificationException: Se produce cuando ocurre una
 * modificación concurrente no permitida en una colección durante la iteración.
 */
public class Treintauno {

    public static void main(String[] args) {
        // Creamos una lista
        List<Integer> lista = new ArrayList<>();

        // Agregamos algunos elementos
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Iteramos sobre la lista
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            System.out.println(elemento);

            // Intentamos agregar un elemento durante la iteración
            if (elemento == 2) {
                lista.add(4); // Esto lanzará ConcurrentModificationException
            }
        }
    }
}
/**
 *
 * java.util.ConcurrentModificationException: Se produce cuando ocurre una
 * modificación concurrente no permitida en una colección durante la iteración.
 */
 
