/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mac
 *
 * java.sql.SQLException: Se produce cuando ocurre un error durante la operación
 * con una base de datos.
 */
public class Decima {

    public static void main(String[] args) {
        // Datos de conexión a la base de datos (cambia según tu configuración)
        String url = "jdbc:mysql://localhost:3306/database_name";
        String usuario = "usuario";
        String contraseña = "contraseña";

        try {
            // Establecer la conexión con la base de datos
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            // Consulta SQL incorrecta
            String sql = "SELECT * FROM tabla_que_no_existe";
            PreparedStatement statement = conn.prepareStatement(sql);

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Procesar el resultado (aquí no se llegará debido a la excepción)
            while (resultSet.next()) {
                // Procesar cada fila
            }

            // Cerrar conexiones
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            // Capturamos la excepción SQLException si ocurre
            System.out.println("Se produjo un error SQL: " + e.getMessage());
        }
    }
}

/**
 *
 * En este ejemplo, estamos intentando ejecutar una consulta SQL que selecciona
 * datos de una tabla que no existe en la base de datos. Esto provocará una
 * excepción java.sql.SQLException. La salida será algo así: Se produjo un error
 * SQL: Table 'database_name.tabla_que_no_existe' doesn't exist
 *
 *
 */
