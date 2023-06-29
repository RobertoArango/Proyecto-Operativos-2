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
    
    public static int idB = 0;
    public static int idL = 0;
    public static int ciclos = 0;
    public static Colas colaRefuerzo1 = new Colas();
    public static Colas colaRefuerzo2 = new Colas();
    public static Colas colaNivel1C1 = new Colas();
    public static Colas colaNivel2C1 = new Colas();
    public static Colas colaNivel3C1 = new Colas();
    public static Colas colaNivel1C2 = new Colas();
    public static Colas colaNivel2C2 = new Colas();
    public static Colas colaNivel3C2 = new Colas();
    
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        admin.agregarVehiculo();
        IA ia = new IA();
        
        Vehiculos vehiculos1;
        Vehiculos vehiculos2;
        
        Carrera carrera = new Carrera();
        carrera.setLocationRelativeTo(null);
        carrera.setVisible(true);

         while (true) {
             
            vehiculos1 = admin.seleccVehiculo(1);
            vehiculos2 = admin.seleccVehiculo(2);
            
            carrera.actualizarColaC1(colaNivel1C1, colaNivel2C1, colaNivel3C1, colaRefuerzo1);
            carrera.actualizarColaC2(colaNivel1C2, colaNivel2C2, colaNivel3C2, colaRefuerzo2);
            
            Vehiculos[] Vehi = {vehiculos1, vehiculos2};
            ia.carrera(Vehi, carrera);
            
            if (ciclos >= 2) {
                admin.agregarVehiculo();
                ciclos = 0;

            }
        }
        
    }
    
}
