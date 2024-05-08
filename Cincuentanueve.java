/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.IllegalComponentStateException;

/**
 *
 * @author mac
 *
 * java.awt.IllegalComponentStateException: Se produce cuando se realiza una
 * operación ilegal en un componente de la interfaz de usuario, como establecer
 * su tamaño o posición cuando no es posible.
 *
 * Este ejemplo ilustra cómo puedes detectar y manejar una
 * IllegalComponentStateException cuando se intenta realizar una operación
 * ilegal en un componente de la interfaz de usuario en Java.
 */
public class Cincuentanueve {

    public static void main(String[] args) {
        try {
            // Crear un botón
            Button button = new Button("Click me");

            // Establecer el tamaño del botón antes de agregarlo a un contenedor
            button.setSize(new Dimension(100, 50));

            // Intentar establecer la posición del botón antes de agregarlo a un contenedor
            button.setLocation(50, 50);

            // Crear un marco y agregar el botón
            Frame frame = new Frame();
            frame.add(button);

            // Mostrar el marco
            frame.setSize(300, 200);
            frame.setVisible(true);
        } catch (IllegalComponentStateException e) {
            // Manejar la excepción de estado ilegal del componente
            System.err.println("Error de estado ilegal del componente: " + e.getMessage());
        }
    }
}
