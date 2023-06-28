/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_operativos_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vito
 */
public class lectorTXT {
    
    public static boolean esInt(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int leer() {
        String paquete = "test\\tiempo.txt";
        File f = new File(paquete);
        int Tiempo = 2;
        String linea;
        try {
            FileReader fr = new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                
                while ((linea = br.readLine()) != null) {
                    if (esInt(linea)) {
                        Tiempo = Integer.parseInt(linea);
                        return Tiempo;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del tiempo", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return Tiempo;
    }
}
