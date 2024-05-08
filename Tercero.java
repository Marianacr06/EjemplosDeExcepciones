/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac Errors (Errores): Los errores en Java son condiciones anormales
 * que generalmente están fuera del control del programador. Estos también
 * derivan de la clase Error. Ejemplos de errores incluyen OutOfMemoryError,
 * StackOverflowError, AssertionError, etc. Los errores indican problemas graves
 * que generalmente no pueden ser manejados por el programa y, por lo general,
 * requieren intervención externa, como ajustar la configuración de la máquina
 * virtual o el entorno de ejecución.
 *
 *
 */
public class Tercero {

    public static void main(String[] args) {
        recursiveMethod(1);
    }

    public static void recursiveMethod(int i) {
        if (i > 10) { // Condición de parada
            System.out.println("Fin de la recursión");
            return;
        }
        System.out.println("Recursion depth: " + i);
        recursiveMethod(i + 1);
    }
}

/**
 *
 * En este código, hemos agregado una condición if que verifica si i es mayor
 * que 10. Si es así, la función imprime un mensaje indicando el fin de la
 * recursión y retorna, deteniendo así las llamadas recursivas. Esto evita que
 * el programa caiga en un bucle infinito y provoque un StackOverflowError.
 *
 */
