/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author mac
 *
 * java.lang.StackOverflowError: Se produce cuando se desborda la pila de
 * llamadas, generalmente debido a una recursión infinita o una profundidad de
 * llamada muy grande.
 *
 *
 */
public class Veintitres {

    public static void main(String[] args) {
        // Llamamos al método recursivo
        metodoRecursivo(0);
    }

    public static void metodoRecursivo(int contador) {
        // Verificamos si el contador ha alcanzado un cierto límite
        if (contador < 1000) {
            // Llamamos a sí mismo de forma recursiva con un contador incrementado
            metodoRecursivo(contador + 1);
        } else {
            // Condición de salida: detener la recursión cuando el contador alcance el límite
            System.out.println("Recursión finalizada.");
        }
    }
}
/**
 *
 * el método recursivo tiene una condición de salida que detiene la recursión
 * cuando el contador alcanza el valor de 1000, evitando así el
 * StackOverflowError
 *
 *
 */
