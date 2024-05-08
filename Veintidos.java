/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import javax.servlet.ServletException;

/**
 *
 * @author mac
 *
 * javax.servlet.ServletException: Se produce cuando ocurre un error durante el
 * procesamiento de una solicitud HTTP en una aplicación web basada en servlets.
 */
public class Veintidos {

    public static void main(String[] args) {
        try {
            // Simulamos una situación que causa un error durante el procesamiento de una solicitud HTTP
            throw new ServletException("Error: Ocurrió un problema durante el procesamiento de la solicitud HTTP");
        } catch (ServletException e) {
            // Capturamos la excepción ServletException e imprimimos el mensaje de error
            System.out.println("Se produjo una ServletException: " + e.getMessage());
        }
    }

}
/**
 *
 * este código simula una situación de error durante el procesamiento de una
 * solicitud HTTP en una aplicación web basada en servlets utilizando la
 * excepción javax.servlet.ServletException, y luego captura y maneja esa
 * excepción para imprimir un mensaje de error informativo.
 */
