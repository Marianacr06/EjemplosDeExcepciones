/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.rmi.RemoteException;

/**
 *
 * @author mac
 *
 *
 * java.rmi.RemoteException: Se produce cuando ocurre un error durante la
 * invocación remota de métodos en aplicaciones distribuidas a través de RMI
 * (Remote Method Invocation).
 */
public class Veintinueve {

    public static void main(String[] args) {
        try {
            realizarLlamadaRemota();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void realizarLlamadaRemota() throws RemoteException {
        // Simulamos un error de invocación remota
        throw new RemoteException("Error en la invocación remota");
    }
}
/**
 *
 * En este ejemplo, el método realizarLlamadaRemota() lanza explícitamente una
 * RemoteException para simular un error durante la invocación remota. Cuando
 * ejecutamos main(), la llamada a realizarLlamadaRemota() resultará en una
 * RemoteException, que se maneja en el bloque catch dentro de main().
 */
