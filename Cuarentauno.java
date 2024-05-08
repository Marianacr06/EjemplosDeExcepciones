/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.lang.management.ManagementFactory;
import javax.management.JMRuntimeException;
import javax.management.MBeanServer;

/**
 *
 * @author mac
 *
 * EjemploJMRuntimeException este código intenta conectar con el agente JMX
 * local y maneja cualquier excepción JMRuntimeException que pueda ocurrir
 * durante la conexión. Si la conexión es exitosa, imprime un mensaje de éxito.
 * Si ocurre un error, imprime un mensaje de error y la traza de la pila de la
 * excepción para diagnosticar el problema.
 */
public class Cuarentauno {

    public static void main(String[] args) {
        // Intentar conectar con el agente JMX local
        try {
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            System.out.println("Conexión exitosa con el agente JMX local.");
        } catch (JMRuntimeException e) {
            // Manejar la excepción JMRuntimeException
            System.err.println("Error al conectar con el agente JMX: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
