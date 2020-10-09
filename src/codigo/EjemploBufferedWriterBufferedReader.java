/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM
 */
public class EjemploBufferedWriterBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "prueba.xml";
        
        escribirBufferWriter(nombre);        
        leerBufferReader(nombre);
    }

    private static void escribirBufferWriter(String nombre) {
        String cadena = "Línea 1";
        String cadena2 = "Línea 2";
        String cadena3 = "Línea 3";
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre));
            
            bw.write(cadena);
            bw.newLine();
            bw.write(cadena2);
            bw.newLine();
            bw.write(cadena3);
            bw.newLine();
            
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error en la escritura del fichero.");
        }
    }

    private static void leerBufferReader(String nombre) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));
            
            int valor = br.read();
            while (valor != -1) {                
                System.out.print((char)valor);
                valor = br.read();
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero.");
        }
    }
    
}
