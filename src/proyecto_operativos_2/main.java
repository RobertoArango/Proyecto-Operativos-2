/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_operativos_2;

/**
 *
 * @author rober
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static int id = 0;
    public static int ciclos = 0;
    public static Colas colaRefuerzo1 = new Colas();
    public static Colas colaRefuerzo2 = new Colas();
    public static Colas ColaNivel1C1 = new Colas();
    public static Colas ColaNivel2C1 = new Colas();
    public static Colas ColaNivel3C1 = new Colas();
    public static Colas ColaNivel1C2 = new Colas();
    public static Colas ColaNivel2C2 = new Colas();
    public static Colas ColaNivel3C2 = new Colas();

    public static void main(String[] args) {
        Administrador admin = new Administrador();
        admin.agregarVehiculo();
        IA ia = new IA();

        Vehiculos vehiculos1;
        Vehiculos vehiculos2;

        while (true) {

            vehiculos1 = admin.seleccVehiculo(1);
            vehiculos2 = admin.seleccVehiculo(2);

            Vehiculos[] Vehi = {vehiculos1, vehiculos2};

            ia.carrera(Vehi);

            if (ciclos >= 2) {
                admin.agregarVehiculo();
                ciclos = 0;
            }
        }

    }

}
