/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 *
 * java.lang.ConcurrentModificationException: Se produce cuando se intenta
 * modificar una colección mientras se itera sobre ella de forma concurrente
 * (sin usar iteradores seguros).
 */
public class Quince {

    public static void main(String[] args) {
        // Creamos una lista
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Iteramos sobre la lista de forma concurrente
        for (String elemento : lista) {
            // Intentamos agregar un nuevo elemento durante la iteración
            lista.add("Nuevo Elemento"); // Esto provocará ConcurrentModificationException
        }
    }
}

/**
 *
 * @author mac
 *
 * En este ejemplo, estamos iterando sobre la lista lista utilizando un bucle
 * for-each. Dentro del bucle, intentamos agregar un nuevo elemento a la lista
 * mientras se está iterando sobre ella. Esto modificará la estructura de la
 * lista mientras se itera, lo que provocará una excepción
 * java.lang.ConcurrentModificationException. La salida podría verse
 * así:Exception in thread "main" java.util.ConcurrentModificationException at
 * java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
 * at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967) at
 * com.mycompany.excepciones.Quince.main(Quince.java:28)
 */
