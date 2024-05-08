/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.VerifyError: Se produce cuando una clase no supera la verificación
 * de bytecode al ser cargada, lo que indica un problema con la consistencia del
 * bytecode.
 */
public class Veintiseis {

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("El resultado es: " + resultado);
    }

    // Aquí devolvemos un tipo de dato String en lugar de int
    public static String sumar(int a, int b) {
        return "El resultado es: " + (a + b);
    }
}

/**
 *
 *
 *
 * En este código, el método sumar debería devolver un tipo int, pero en su
 * lugar devuelve un String. Esto viola las reglas de verificación de bytecode y
 * puede resultar en un java.lang.VerifyError cuando intentas cargar la clase.
 */
