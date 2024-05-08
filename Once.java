/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author mac
 * java.io.IOException: Se produce cuando ocurre un error durante la
 * operación de entrada/salida, como la lectura o escritura de archivos.
 */
public class Once {

    public static void main(String[] args) {
        try {
            // Intentamos leer un archivo que no existe
            BufferedReader reader = new BufferedReader(new FileReader("archivo_que_no_existe.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            // Capturamos la excepción IOException si ocurre
            System.out.println("Se produjo un error de E/S: " + e.getMessage());
        }
    }
}


