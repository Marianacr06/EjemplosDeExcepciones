/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac java.lang.RuntimeException: La clase base para todas las
 * excepciones no verificadas. Estas excepciones pueden ocurrir durante la
 * ejecución del programa y no están sujetas a las reglas de manejo de
 * excepciones del compilador.
 *
 */
public class Quinto {
    public static void main(String[] args) {
        int divisor = 0;
        if (divisor != 0) {
            int resultado = 10 / divisor;
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}


/**
 *
 * En este ejemplo, estamos intentando dividir un número por cero, lo cual no
 * está permitido en matemáticas y resultará en una excepción
 * java.lang.ArithmeticException, que es una subclase de
 * java.lang.RuntimeException.
 *
 *
 */
