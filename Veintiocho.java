/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author mac
 *
 *
 * java.awt.AWTException: Se produce cuando ocurre un error en la biblioteca de
 * Abstract Window Toolkit (AWT), que se utiliza para crear interfaces gráficas
 * de usuario en Java.
 */
public class Veintiocho {

    public static void main(String[] args) {
        try {
            // Crear un objeto Robot para interactuar con el sistema de ventanas
            Robot robot = new Robot();

            // Obtener el tamaño de la pantalla
            Rectangle areaCaptura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            // Capturar la pantalla en un objeto BufferedImage
            BufferedImage captura = robot.createScreenCapture(areaCaptura);

            // Guardar la captura de pantalla en un archivo
            File archivoSalida = new File("captura.png");
            ImageIO.write(captura, "png", archivoSalida);

            System.out.println("¡Captura de pantalla realizada con éxito!");

        } catch (AWTException | IOException e) {
            // Manejar cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }
}

/**
 *
 * Este código intenta capturar una captura de pantalla utilizando
 * Robot.createScreenCapture(). Si por alguna razón, la operación de captura de
 * pantalla no puede ser llevada a cabo (por ejemplo, si no se tienen permisos
 * adecuados, o si no se puede acceder al sistema de ventanas), se lanzará una
 * java.awt.AWTException.
 */
