/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class Primera {
    public static void main(String[] args) {
    try {
        // Especificamos la ruta completa del archivo
        String rutaArchivo = "/Users/mac/NetBeansProjects/Escribir.txt";
        // Intentamos leer el archivo
        leerArchivo(rutaArchivo);
    } catch (FileNotFoundException e) {
        // Manejamos la excepción de archivo no encontrado
        System.out.println("El archivo no se encontró: " + e.getMessage());
    }
}
public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        // Intentamos abrir el archivo
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);
        
        // Leemos el contenido del archivo
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        
        scanner.close();
    }
}


