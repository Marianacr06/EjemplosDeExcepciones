/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.IllegalArgumentException: Se produce cuando un método recibe un
 * argumento ilegal.
 */
public class Octavo {

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        double dividendo = 10;
        double divisor = 0;

        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/**
 *
 * @author mac
 *
 * tenemos una clase Calculadora que tiene un método llamado dividir, el cual
 * espera recibir un divisor distinto de cero. Si se le pasa cero como divisor,
 * se lanzará una excepción IllegalArgumentException.
 */
