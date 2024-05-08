/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mac
 *
 *
 * java.lang.UnsupportedOperationException: Se produce cuando se intenta
 * realizar una operación no compatible o no soportada, generalmente en
 * estructuras de datos inmutables.
 */
public class Catorce {

    public static void main(String[] args) {
        // Creamos una lista mutable
        List<String> listaMutable = new ArrayList<>();
        listaMutable.add("Elemento 1");
        listaMutable.add("Elemento 2");

        // Creamos una lista inmutable a partir de la lista mutable
        List<String> listaInmutable = Collections.unmodifiableList(listaMutable);

        try {
            // Intentamos agregar un elemento a la lista inmutable
            listaInmutable.add("Elemento 3");
        } catch (UnsupportedOperationException e) {
            // Capturamos la excepción UnsupportedOperationException si ocurre
            System.out.println("Se ha producido un error de operación no compatible: " + e.getMessage());
        }
    }

}
/**
 *
 *
 *
 * En este ejemplo, tratamos de agregar un elemento a la lista inmutable
 * listaInmutable después de haberla creado utilizando
 * Collections.unmodifiableList(). Este método devuelve una vista inmutable de
 * la lista original, por lo que cualquier intento de modificar la lista lanzará
 * un java.lang.UnsupportedOperationException. La salida podría verse así:
 * Se ha producido un error de operación no compatible: java.util.Collections$UnmodifiableCollection.add
 */
