/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.IllegalThreadStateException: Se produce cuando se intenta realizar
 * una operación inválida en un hilo, como iniciar un hilo que ya ha sido
 * iniciado.
 *
 *
 */
public class Treintacuatro {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // Simulación de un trabajo largo
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tarea completada.");
        });

        // Intentar iniciar el hilo dos veces
        thread.start();
        // Esto lanzará IllegalThreadStateException
        thread.start();
    }

}
/**
 *
 * el código intenta iniciar el mismo hilo dos veces consecutivas, lo que no
 * está permitido y resultará en una excepción IllegalThreadStateException.
 *
 *
 */
