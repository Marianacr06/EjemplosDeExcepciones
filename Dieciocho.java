/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mac
 *
 * java.lang.IllegalStateException: Se produce cuando el estado interno de un
 * objeto no es adecuado para realizar una operación específica.
 */
public class Dieciocho {

    public static void main(String[] args) {
        // Creamos una cola (Deque) vacía
        Deque<String> cola = new ArrayDeque<>();

        // Intentamos obtener el primer elemento de la cola, que está vacía
        String primerElemento = cola.getFirst();
    }

}
/**
 *
 *
 * En este ejemplo, estamos intentando obtener el primer elemento de una cola
 * (Deque) vacía utilizando el método getFirst(). Esto provocará una excepción
 * java.lang.IllegalStateException porque el estado interno de la cola no es
 * adecuado para realizar esta operación cuando está vacía
 */
