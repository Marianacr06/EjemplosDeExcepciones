/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarException;

/**
 *
 * @author mac
 *
 * java.util.jar.JarException: Se produce cuando ocurre un error al leer o
 * escribir un archivo JAR (archivo de Java ARchive), como un archivo JAR dañado
 * o no válido.Se intenta abrir un archivo JAR y obtener una enumeración de sus
 * entradas (archivos y directorios dentro del archivo JAR). Si ocurre un error
 * durante la apertura o lectura del archivo JAR, se lanzará una JarException.
 * La excepción se captura y se maneja adecuadamente, imprimiendo un mensaje de
 * error indicando el problema con el archivo JAR. Este ejemplo ilustra cómo
 * puedes detectar y manejar una JarException cuando se produce un error al leer
 * o escribir un archivo JAR en Java.
 */
public class Sesenta {

    public static void main(String[] args) {
        // Nombre del archivo JAR (debes proporcionar un archivo JAR existente)
        String jarFileName = "example.jar";

        try {
            // Crear un objeto JarFile para leer el archivo JAR
            JarFile jarFile = new JarFile(jarFileName);

            // Obtener la enumeración de entradas en el archivo JAR
            Enumeration<JarEntry> entries = jarFile.entries();

            // Iterar sobre las entradas del archivo JAR
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                System.out.println("Entrada en el archivo JAR: " + entry.getName());
            }

            // Cerrar el archivo JAR
            jarFile.close();
        } catch (IOException e) {
            // Manejar excepciones de E/S (por ejemplo, archivo JAR no encontrado)
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (JarException e) {
            // Manejar la excepción de error del archivo JAR
            System.err.println("Error del archivo JAR: " + e.getMessage());
        }
    }
}
