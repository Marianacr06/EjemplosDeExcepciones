/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.text.CollationKey;
import java.text.Collator;

/**
 *
 * @author mac
 *
 * java.text.CollationKey: Se produce cuando ocurre un error al realizar
 * operaciones con claves de ordenación de texto.
 */
public class Cincuentacuatro {

    public static void main(String[] args) {
        // Crear un Collator para ordenar en español
        Collator collator = Collator.getInstance();

        // Obtener las claves de ordenación para dos cadenas de texto
        CollationKey key1 = collator.getCollationKey("manzana");
        CollationKey key2 = collator.getCollationKey("banana");

        // Comparar las claves de ordenación
        int result = key1.compareTo(key2);

        // Imprimir el resultado de la comparación
        if (result < 0) {
            System.out.println("manzana viene antes que banana");
        } else if (result > 0) {
            System.out.println("banana viene antes que manzana");
        } else {
            System.out.println("manzana y banana son iguales en orden");
        }
    }
}
/**
 *
 * Este código crea un Collator para ordenar cadenas de texto en español y luego
 * obtiene las claves de ordenación para las cadenas "manzana" y "banana".
 * Después, compara estas claves de ordenación para determinar el orden relativo
 * de las cadenas en función de las reglas de ordenación del idioma español.
 *
 * 
 */
