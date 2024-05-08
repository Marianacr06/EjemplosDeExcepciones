/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author mac
 *
 * a excepción NamingException se maneja cuando se intenta buscar un nombre que
 * no existe en el contexto especificado. Si el objeto devuelto por
 * context.lookup("no_existe") es nulo, significa que el nombre no fue
 * encontrado en el contexto y se imprime un mensaje indicando eso.
 */
public class Treintasiete {

    public static void main(String[] args) {
        try {
            // Crear un contexto inicial con la configuración adecuada
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
            env.put(Context.PROVIDER_URL, "file:///tmp");
            Context context = new InitialContext(env);

            // Intentar buscar un nombre que no existe en el contexto
            Object obj = context.lookup("no_existe");

            // Si el objeto es nulo, significa que el nombre no fue encontrado
            if (obj == null) {
                System.out.println("El nombre no fue encontrado.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
