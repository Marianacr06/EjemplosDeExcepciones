/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 *
 * java.lang.NoClassDefFoundError: Se produce cuando una clase necesaria para la
 * ejecución del programa no puede ser encontrada en tiempo de ejecución.
 */
public class Veinticiete {

    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.conectar();
    }
}

/**
 *
 * Cuando ejecutas public class Veinticiete, obtendrás una java.lang.NoClassDefFoundError porque la
 * JVM no puede encontrar la definición de la clase ConexionBD que se necesita
 * para ejecutar Main.
 */
