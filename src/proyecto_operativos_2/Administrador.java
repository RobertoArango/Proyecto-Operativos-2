/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_operativos_2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rober
 */

public class Administrador {
    
    private Vehiculos retornarVehiculoAgregado(int calidad, int marca){
        //estos valores son placeholders, mas adelante cuando detallemos la sumatoria de calidades se dictara el valor condicional
        if (calidad <= 1) {
            int id = main.id++;
            Vehiculos vehiculo = new Vehiculos(id, 3, calidad, marca);
            return vehiculo;
            
        } else if (calidad >= 2 && calidad <= 3){
            int id = main.id++;
            Vehiculos vehiculo = new Vehiculos(id, 2, calidad, marca);
            return vehiculo;
            
        } else { 
            int id = main.id++;
            Vehiculos vehiculo = new Vehiculos(id, 1, calidad, marca);
            return vehiculo;
        }
        
    }
    
    
    //Dictando las colas de prioridad
    private void colaNivel(Vehiculos vehiculo, Colas colaNivel1, Colas colaNivel2, Colas colaNivel3) {
        switch (vehiculo.nivel) {
            case 1: {
                colaNivel1.encolar(vehiculo);
            }
            case 2: {
                colaNivel2.encolar(vehiculo);
            }
            case 3: {
                colaNivel3.encolar(vehiculo);
            }
            default: {
                break;
            }
        }
    }
    
    private int CalidadVehiculo(int cant, int prob, int prob1) {
        
        int minimo = 4;
        int maximo = 10;
        int random_int = ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
        
        for (int i = 0; i < cant; i++) {
            if (ThreadLocalRandom.current().nextInt(0, prob) <= prob1) {
                
                return random_int;
            }
            else {
                return 0;
            }
        }
        return 0;
    }
    
    public void agregarVehiculo() {
        
        Random probs = new Random(); 
        
        int carroceriaProb = probs.nextInt(100);
        int chasisProb = probs.nextInt(100);
        int motorProb = probs.nextInt(100);
        int ruedaProb = probs.nextInt(100);
        
        int total = 0;
        
        int carroceriaProb2 = probs.nextInt(100);
        int chasisProb2 = probs.nextInt(100);
        int motorProb2 = probs.nextInt(100);
        int ruedaProb2 = probs.nextInt(100);
        
        int total2 = 0;
        
        if (main.ciclos < 2){
            //Bugatti
            int carroceria1 = CalidadVehiculo(2, carroceriaProb, 60);
            total += carroceria1;
            //probs.nextInt(100) <=70
            
            int chasis1 = CalidadVehiculo(1, chasisProb, 70);
            total += chasis1;
            
            int motores1 = CalidadVehiculo(4, motorProb, 50);
            total += motores1;
            
            int ruedas1 = CalidadVehiculo(4, ruedaProb, 60);
            total += ruedas1;
            
            Vehiculos vehiculo1 = retornarVehiculoAgregado(total, 1);
            vehiculo1.setNombre("Bugatti");
            vehiculo1.setInfo("2 carrocerias, 1 chasis, 4 motores, 4 ruedas");
            colaNivel(vehiculo1, main.colaNivel1C1, main.colaNivel2C1, main.colaNivel3C1);
            System.out.println(vehiculo1.getNombre());
            System.out.println(vehiculo1.id);
            System.out.println(vehiculo1.calidad);
                    
            //Lambo
            int carroceria2 = CalidadVehiculo(1, carroceriaProb2, 60);
            total += carroceria2;
             
            int chasis2 = CalidadVehiculo(2, chasisProb2, 70);
            total += chasis2;
                    
            int motores2 = CalidadVehiculo(6, motorProb2, 50);
            total += motores2;
            
            int ruedas2 = CalidadVehiculo(5, ruedaProb2, 60);
            total+= ruedas2;
            
            Vehiculos vehiculo2 = retornarVehiculoAgregado(total, 2);
            vehiculo1.setNombre("Lamborghini");
            vehiculo1.setInfo("1 carroceria, 2 chasis, 6 motores, 5 ruedas");
            colaNivel(vehiculo2, main.colaNivel1C2, main.colaNivel2C2, main.colaNivel3C2);
            System.out.println(vehiculo2.getNombre());
            System.out.println(vehiculo2.id);
            System.out.println(vehiculo2.calidad);
        }
    }
    
    public Vehiculos seleccVehiculo(int marca) {
        
        return null;
        
    }
    
    public void reEncolar(Vehiculos vehiculo) {
        
    }
    
    public void encolarRefuerzo(Vehiculos vehiculo) {
    }
    
}