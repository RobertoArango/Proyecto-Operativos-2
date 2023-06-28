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

    public void carrera(Vehiculos[] Vehi) {
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

            if (Vehi[0].puntos > Vehi[1].puntos) {
                ganador = Vehi[0];
                ganar = true;

            } else if (Vehi[1].puntos > Vehi[0].puntos) {
                ganador = Vehi[1];
                ganar = true;

            } else {
                Random random2 = new Random();
                int probResultado2 = random2.nextInt(2);

                if (probResultado2 < 1) {
                    ganador = Vehi[0];
                    ganar = true;
                } else {
                    ganador = Vehi[1];
                    ganar = true;
                }
            }

        } else if (probResultado > 40 && probResultado <= 67) {

            empatados[0] = Vehi[0];
            empatados[1] = Vehi[1];
            empatar = true;

        } else {

            fallados[0] = Vehi[0];
            fallados[1] = Vehi[1];
            fallar = true;

        }

        if (ganar) {
            System.out.println("Ganó:");
            System.out.println(ganador.nombre);
            System.out.println(ganador.info);
        } else if (empatar) {
            for (Vehiculos empatado : empatados) {
                admin.reEncolar(empatado);
            }

            System.out.println("Empatados:");
            System.out.println(empatados[0].nombre + " vs. " + empatados[1].nombre);
        } else if (fallar) {
            for (Vehiculos fallado : fallados) {
                admin.encolarRefuerzo(fallado);
            }

            System.out.println("Fallados:");
            System.out.println(fallados[0].nombre + " vs. " + fallados[1].nombre);
        }

        main.ciclos++;

        try {
            estado = "Carrera";
            TimeUnit.SECONDS.sleep(lectorTXT.leer());

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la IA", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}
