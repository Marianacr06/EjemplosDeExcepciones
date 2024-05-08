/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

/**
 *
 * @author mac java.sql.SQLTimeoutException: Se produce cuando una operación de
 * base de datos no se completa dentro del tiempo límite especificado.
 */
public class Cincuetatres {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database";
        String user = "username";
        String password = "password";

        String query = "SELECT * FROM tabla";

        try (Connection connection = DriverManager.getConnection(url, user, password); Statement statement = connection.createStatement()) {

            // Establecemos un tiempo límite de 5 segundos para la consulta
            statement.setQueryTimeout(5);

            ResultSet resultSet = statement.executeQuery(query);

            // Procesamos el resultado de la consulta
            while (resultSet.next()) {
                // Realizar operaciones con los datos obtenidos
            }

            System.out.println("Consulta completada correctamente");

        } catch (SQLException e) {
            if (e instanceof SQLTimeoutException) {
                System.err.println("La consulta excedió el tiempo límite: " + e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
/**
 *
 * Si la excepción es una SQLTimeoutException, se imprime un mensaje específico
 * indicando que la consulta excedió el tiempo límite. En caso de cualquier otra
 * excepción, se imprime el rastreo de la pila para depurar el problema. Esto
 * permite manejar de manera específica la situación en la que una consulta
 * tarda más de lo esperado en ejecutarse.
 */
