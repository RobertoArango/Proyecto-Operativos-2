/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_operativos_2;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class IA {

    String estado = "Preparando";
    
    public static String resultado = "";
    public static int wB = 0;
    public static int wL = 0;

    public void carrera(Vehiculos[] Vehi, Carrera carrera) {
        try {
            estado = "Carrera";
            TimeUnit.SECONDS.sleep(lectorTXT.leer());

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la IA", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        Administrador admin = new Administrador();

        Vehiculos ganador = null;
        Vehiculos[] empatados = new Vehiculos[2];
        Vehiculos[] fallados = new Vehiculos[2];

        boolean ganar = false;
        boolean empatar = false;
        boolean fallar = false;
       
        Random random = new Random();
        int probResultado = random.nextInt(100);
        
        if (probResultado <= 40) {

            resultado = "En carrera";

            if (Vehi[0].puntos > Vehi[1].puntos) {
                ganador = Vehi[0];
                ganar = true;
                wB++;

            } else if (Vehi[1].puntos > Vehi[0].puntos) {
                ganador = Vehi[1];
                ganar = true;
                wL++;

            } else {
                Random random2 = new Random();
                int probResultado2 = random2.nextInt(2);

                if (probResultado2 < 1) {
                    ganador = Vehi[0];
                    ganar = true;
                    wB++;
                } else {
                    ganador = Vehi[1];
                    ganar = true;
                    wL++;
                }
            }

        } else if (probResultado > 40 && probResultado <= 67) {

            resultado = "En carrera";
            empatados[0] = Vehi[0];
            empatados[1] = Vehi[1];
            empatar = true;

        } else {

            resultado = "En carrera";
            fallados[0] = Vehi[0];
            fallados[1] = Vehi[1];
            fallar = true;

        }

        if (ganar) {
            System.out.println("Ganó:");
            System.out.println(ganador.nombre);
            System.out.println(ganador.info);
            resultado = "Ganador " + ganador.nombre;
        } else if (empatar) {
            //for (Vehiculos empatado : empatados) {
            //    admin.reEncolar(empatado);
            //}

            admin.reEncolar(empatados[0]);
            admin.reEncolar(empatados[1]);

            System.out.println("Empatados:");
            System.out.println(empatados[0].nombre + " vs. " + empatados[1].nombre);
            resultado = "Empate";
        } else if (fallar) {
            //for (Vehiculos fallado : fallados) {
            //    admin.encolarRefuerzo(fallado);
            //}

            admin.encolarRefuerzo(fallados[0]);
            admin.encolarRefuerzo(fallados[1]);

            System.out.println("Fallados:");
            System.out.println(fallados[0].nombre + " vs. " + fallados[1].nombre);
            resultado = "Fallo";
        }

        main.ciclos++;
        admin.desencolarRefuerzo();        
        
        try {
            estado = "Carrera";
            TimeUnit.SECONDS.sleep(lectorTXT.leer());

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la IA", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}
