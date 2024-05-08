/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author mac
 *
 * EjemploPrinterException este código crea un trabajo de impresión que simula
 * la impresión de un documento de prueba y lo envía a la impresora
 * predeterminada. Si ocurre algún error durante el proceso de impresión, se
 * maneja la excepción PrinterException y se imprime un mensaje de error.
 */
public class Cuarentatres {

    public static void main(String[] args) {
        // Crear un trabajo de impresión
        PrinterJob job = PrinterJob.getPrinterJob();

        // Setear el trabajo de impresión
        job.setPrintable((graphics, pageFormat, pageIndex) -> {
            // Simular impresión de un documento
            graphics.drawString("Documento de prueba", 150, 150);
            return Printable.PAGE_EXISTS;
        });

        // Intentar imprimir el documento
        try {
            job.print();
        } catch (PrinterException e) {
            // Manejar la excepción PrinterException
            System.err.println("Error al imprimir: " + e.getMessage());
        }
    }

}
