/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 *
 * java.lang.OutOfMemoryError: Se produce cuando no hay suficiente memoria
 * disponible para la creación de nuevos objetos.
 */
public class Doce {
        public static void main(String[] args) {
            List<Object> lista = new ArrayList<>();

            try {
                while (true) {
                    lista.add(new Object());
                }
            } catch (OutOfMemoryError e) {
                // Captura la excepción OutOfMemoryError si ocurre
                System.out.println("Se ha producido un error de memoria: " + e.getMessage());
            }
        }
    }

/**
 *
 *
 *
 * Este programa intentará crear objetos indefinidamente dentro de un bucle
 * while (true), agregándolos a una lista. Eventualmente, el sistema se quedará
 * sin memoria y lanzará un java.lang.OutOfMemoryError. La salida podría verse
 * así:
 */
