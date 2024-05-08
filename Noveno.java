/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.ClassNotFoundException: Se produce cuando una clase no puede ser
 * encontrada por el cargador de clases.
 */
public class Noveno {

    public static void main(String[] args) {
        try {
            // Intenta cargar la clase Secondary que no existe
            Class.forName("Secondary");
        } catch (ClassNotFoundException e) {
            // Captura la excepción si no se puede encontrar la clase
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
/**
 *
 * ClassNotFoundException. Supongamos que tienes dos clases, una principal Main
 * y otra secundaria Secondary, y la clase Noveno intenta cargar la clase
 * Secondary, pero esta última no existe en el classpath pero no existe 
 *
 *
 */
