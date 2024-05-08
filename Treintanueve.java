/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author mac
 *
 * IOException: se intenta crear un ServerSocket en el puerto especificado
 * (PUERTO). Si hay algún problema al abrir el servidor socket, se lanzará una
 * IOException, que se captura en el bloque catch. Dentro del bloque catch, se
 * imprime un mensaje de error indicando el problema que ocurrió al intentar
 * abrir el servidor socket en el puerto especificado.
 */
public class Treintanueve {

    public static void main(String[] args) {
        // Puerto que intentaremos utilizar
        final int PUERTO = 7060;

        // Intentar abrir un servidor socket en el puerto especificado
        try {
            ServerSocket serverSocket = new ServerSocket(PUERTO);
            System.out.println("Servidor socket abierto en el puerto: " + PUERTO);
        } catch (IOException e) {
            // Manejar la excepción de enlace (BindException)
            System.err.println("Error al abrir el servidor socket en el puerto " + PUERTO + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
