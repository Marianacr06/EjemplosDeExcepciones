/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac El código proporcionado pertenece a una excepción de tipo
 * java.lang.ArithmeticException.
 *
 * La razón es que la excepción java.lang.ArithmeticException se lanza cuando se
 * produce una condición de error aritmético, como la división por cero. En este
 * caso, la función divide intenta realizar una división entre el numerador y el
 * denominador. Si el denominador es cero, se lanza una excepción. Por lo tanto,
 * la excepción que se lanza en este código es una instancia de
 * ArithmeticException.
 *
 * Aunque el código utiliza una declaración throws Exception, en realidad está
 * lanzando una instancia de ArithmeticException cuando el denominador es cero,
 * lo que se ajusta más específicamente a la situación de error aritmético que
 * se está manejando.
 *
 */
public class Cuarto {

    public static void main(String[] args) {
        try {
            // Simulando una operación que podría lanzar una excepción
            int resultado = divide(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            // Manejo de la excepción
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static int divide(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            // Lanzando una excepción si el denominador es cero
            throw new Exception("No se puede dividir por cero");
        }
        return numerador / denominador;
    }
}

/**
 *
 * En este ejemplo, la función divide intenta realizar una división entre el
 * numerador y el denominador. Si el denominador es cero, lo cual no está
 * permitido en matemáticas, la función lanza una excepción utilizando la clase
 * Exception. En el método main, hemos rodeado la llamada a divide con un bloque
 * try-catch para manejar cualquier excepción que pueda surgir durante la
 * ejecución. Si se lanza una excepción, se imprime un mensaje indicando que
 * ocurrió un error.
 *
 */
