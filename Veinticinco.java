/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.IllegalMonitorStateException: Se produce cuando ocurre un error al
 * usar monitores, por ejemplo, al llamar a métodos wait(), notify(), o
 * notifyAll() fuera de un bloque sincronizado.
 */
public class Veinticinco {

    private static final Object monitor = new Object();

    public static void main(String[] args) {
        try {
            monitor.wait(); // Esperar sin estar dentro de un bloque sincronizado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 *
 * En este ejemplo, estamos llamando al método wait() en el objeto monitor sin
 * haber sincronizado en este objeto previamente con synchronized. Esto
 * resultará en una java.lang.IllegalMonitorStateException porque el método
 * wait() debe ser llamado dentro de un bloque sincronizado.
 */
