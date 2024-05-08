/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac Unchecked Exceptions (Excepciones no Verificadas):Estas son
 * excepciones que no necesitan ser manejadas explícitamente en el código. No
 * están sujetas a las reglas de manejo de excepciones del compilador. Las
 * unchecked exceptions derivan de la clase RuntimeException. Algunos ejemplos
 * incluyen NullPointerException, ArrayIndexOutOfBoundsException,
 * IllegalArgumentException, etc. Estas excepciones a menudo indican errores de
 * programación o condiciones inesperadas durante la ejecución del programa.
 *
 */
public class Segundo {

    public static void main(String[] args) {
        String str = null;

        try {
            // Intentamos acceder a la longitud de una cadena
            int length = str.length(); // Esto no lanzará NullPointerException
            System.out.println("La longitud de la cadena es: " + length);
        } catch (NullPointerException e) {
            // Capturamos la excepción y mostramos un mensaje
            System.out.println("Se ha producido una NullPointerException: " + e.getMessage());
        }
    }
}

/**
 *
 * Este código intenta acceder a la longitud de una cadena que está
 * inicializada como null. Cuando intenta llamar al método length() en la
 * variable str, que es una referencia a un objeto de tipo String, se lanza una
 * NullPointerException. Sin embargo, dentro del bloque try, esta excepción es
 * capturada y se imprime un mensaje que indica que se ha producido una
 * NullPointerException.. En cambio, la salida de este código será: Se ha
 * producido una NullPointerException: null. Este mensaje indica que se ha
 * producido una excepción del tipo NullPointerException, y el mensaje asociado
 * con la excepción es null, ya que la variable str estaba inicializada como
 * null.
 *
 */
