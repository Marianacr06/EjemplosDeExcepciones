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
 * java.util.NoSuchElementException: Se produce cuando se intenta acceder a un
 * elemento que no existe, por ejemplo, al intentar obtener el siguiente
 * elemento de una colección cuando no hay más elementos disponibles.
 */
public class Ventiuno {

    public static void main(String[] args) {
        // Creamos una lista vacía
        List<String> lista = new ArrayList<>();

        // Intentamos obtener un iterador de la lista vacía
        Iterator<String> iterador = lista.iterator();

        try {
            // Intentamos obtener el siguiente elemento del iterador, que no existe
            String elemento = iterador.next();
        } catch (java.util.NoSuchElementException e) {
            // Capturamos la excepción NoSuchElementException si ocurre
            System.out.println("Se ha producido un error de elemento no encontrado: " + e.getMessage());
        }
    }

}

/**
 *
 * En este ejemplo, estamos intentando obtener el siguiente elemento de un
 * iterador de una lista vacía utilizando el método next() de Iterator. Dado que
 * no hay elementos en la lista, esto provocará una excepción
 * java.util.NoSuchElementException. La salida podría verse así:Se ha producido
 * un error de elemento no encontrado: No such element
 */
