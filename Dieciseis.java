/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mac
 *
 * java.lang.SecurityException: Se produce cuando se produce un error de
 * seguridad, como la falta de permisos necesarios para realizar una operación.
 *
 */
public class Dieciseis {

    public static void main(String[] args) {
        try {
            // Intentamos crear un archivo en una ubicación protegida
            File archivo = new File("/DirectorioProtegido/archivo.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Contenido del archivo");
            escritor.close();
        } catch (SecurityException e) {
            // Capturamos la excepción SecurityException si ocurre
            System.out.println("Se ha producido un error de seguridad: " + e.getMessage());
        } catch (IOException e) {
            // Capturamos otras excepciones de E/S si ocurren
            System.out.println("Se ha producido un error de E/S: " + e.getMessage());
        }
    }
}

/**
 *
 * En este ejemplo, intentamos crear un archivo en una ubicación protegida
 * (/DirectorioProtegido/archivo.txt). Dependiendo del sistema operativo y la
 * configuración de seguridad, esto podría lanzar una excepción
 * java.lang.SecurityException si el programa no tiene permisos suficientes para
 * escribir en ese directorio. La salida variará dependiendo de la configuración de seguridad y el sistema
 * operativo, pero podría ser algo como: Se ha producido un error de seguridad: Permission denied
 *
 */
