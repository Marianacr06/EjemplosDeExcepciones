/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author mac
 *
 * java.util.regex.PatternSyntaxException: Se produce cuando se encuentra un
 * error en la sintaxis de una expresión regular, como un error de sintaxis en
 * el patrón de búsqueda.La excepción se captura y se maneja adecuadamente,
 * imprimiendo información sobre el error, como la descripción del error, la
 * posición en la que ocurrió y la expresión regular incorrecta. Este ejemplo
 * ilustra cómo puedes detectar y manejar errores de sintaxis en expresiones
 * regulares en Java utilizando PatternSyntaxException.
 */
public class Cincuentaocho {
public static void main(String[] args) {
        // Patrón de expresión regular con error de sintaxis
        String regexPattern = "[a-z]"; // Falta el corchete de cierre
        
        try {
            // Compilar el patrón de expresión regular
            Pattern pattern = Pattern.compile(regexPattern);
            // Intentar hacer algo con el patrón (en este caso, solo mostrarlo)
            System.out.println("Expresión regular compilada correctamente: " + pattern.pattern());
        } catch (PatternSyntaxException e) {
            // Manejar la excepción de error de sintaxis de la expresión regular
            System.err.println("Error de sintaxis en la expresión regular: " + e.getDescription());
            System.err.println("Posición del error: " + e.getIndex());
            System.err.println("Expresión regular incorrecta: " + e.getPattern());
        }
    }
}