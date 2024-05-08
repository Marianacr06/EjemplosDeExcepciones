/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.InterruptedException: Se produce cuando un hilo es interrumpido
 * mientras está en un estado de espera, sueño o bloqueado.
 */
public class Treintatres {

    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            try {
                // El hilo duerme durante 5 segundos
                System.out.println("Hilo en estado de espera.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // Se captura la InterruptedException si el hilo es interrumpido mientras está en espera
                System.out.println("Hilo interrumpido mientras estaba en espera.");
                e.printStackTrace();
            }
        });

        // Iniciamos el hilo
        hilo.start();

        // Esperamos un momento y luego interrumpimos el hilo
        try {
            Thread.sleep(2000);
            System.out.println("Interrumpiendo el hilo.");
            hilo.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 *
 * En este ejemplo, creamos un nuevo hilo que duerme durante 5 segundos
 * utilizando Thread.sleep(5000). Mientras el hilo está en este estado de
 * espera, lo interrumpimos utilizando hilo.interrupt(). Esto provocará que se
 * lance una java.lang.InterruptedException dentro del hilo, que será capturada
 * en el bloque catch correspondiente.
 */
