/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mac java.sql.BatchUpdateException: Se produce cuando ocurre un error
 * durante una operación de actualización en lote en una base de datos.
 */
public class Cincuetados {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/database";
            String user = "username";
            String password = "password";

            String updateSQL = "UPDATE Usuarios SET nombre = ? WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(url, user, password); PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {

                // Configuramos los valores para la actualización en lote
                preparedStatement.setString(1, "NuevoNombre");

                // Primera actualización
                preparedStatement.setInt(2, 1);
                preparedStatement.addBatch();

                // Segunda actualización
                preparedStatement.setInt(2, 2);
                preparedStatement.addBatch();

                // Ejecutamos el lote de actualizaciones
                int[] result = preparedStatement.executeBatch();

                // Verificamos los resultados
                for (int i : result) {
                    if (i == Statement.EXECUTE_FAILED) {
                        System.out.println("Error durante la actualización en lote");
                        throw new BatchUpdateException();
                    }
                }

                System.out.println("Actualización en lote completada");

            } catch (SQLException e) {
                if (e instanceof BatchUpdateException) {
                    System.err.println("Error durante la actualización en lote: " + e.getMessage());
                } else {
                    e.printStackTrace();
                }
            }
        }
    }

/**
 *
 * Supongamos que tenemos una tabla llamada Usuarios con columnas id y nombre.
 * Queremos realizar una operación de actualización en lote para cambiar el
 * nombre de varios usuarios a la vez. Si uno de los cambios falla, queremos
 * manejar la excepción adecuadamente.
 */
