/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mac java.util.ConcurrentModificationException: Se produce cuando se
 * detecta una modificación concurrente no permitida en una estructura de datos,
 * como un conjunto, mientras se está iterando sobre ella.
 */
public class Cincuentaseis {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Agregar elementos a la lista
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterar sobre la lista
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Elemento: " + element);
            // Intentar modificar la lista durante la iteración
            if (element == 3) {
                list.remove(element); // Modificación concurrente
            }
        }
    }
}
/**
 *
 * En este ejemplo, estamos iterando sobre una lista y tratamos de eliminar un
 * elemento de la lista dentro del bucle utilizando el método remove(). Esto
 * modificará la lista mientras se está iterando sobre ella, lo cual es una
 * modificación concurrente no permitida y provocará que se lance
 * ConcurrentModificationException.
 *
 * Para evitar esto, se pueden utilizar estructuras de datos concurrentes o
 * sincronizadas como CopyOnWriteArrayList, o se puede utilizar una estrategia
 * diferente para modificar la lista, como almacenar los elementos que se desean
 * eliminar en una lista separada y luego eliminarlos después de que haya
 * finalizado la iteración.
 */
