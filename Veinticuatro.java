/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.lang.reflect.Field;

/**
 *
 * @author mac
 *
 *
 * java.lang.IllegalAccessException: Se produce cuando se intenta acceder a un
 * miembro de una clase (como un campo o método) de manera ilegal, como intentar
 * acceder a un campo privado desde fuera de la clase. En este ejemplo, estamos
 * dentro de la clase EjemploIllegalAccessException y tratamos de acceder
 * directamente al campo privado mensajePrivado. Esto causará una
 * java.lang.IllegalAccessException porque estamos intentando acceder a un campo
 * privado desde fuera de sus límites de acceso.
 */
public class Veinticuatro {

    private String mensajePrivado = "Este es un mensaje privado";

    public Veinticuatro() {
        try {
            // Intentamos acceder al campo privado directamente
            Field campo = getClass().getDeclaredField("mensajePrivado");
            campo.setAccessible(true); // Hacemos que el campo sea accesible
            String mensaje = (String) campo.get(this);
            System.out.println("Mensaje privado: " + mensaje);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Veinticuatro();
    }
}
