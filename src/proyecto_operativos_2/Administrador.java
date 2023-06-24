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

        if (main.ciclos < 2) {
            //Bugatti
            int carroceria1 = CalidadVehiculo(2, carroceriaProb, 60);
            total += carroceria1;

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
            total += ruedas2;

            Vehiculos vehiculo2 = retornarVehiculoAgregado(total, 2);
            vehiculo1.setNombre("Lamborghini");
            vehiculo1.setInfo("1 carroceria, 2 chasis, 6 motores, 5 ruedas");
            colaNivel(vehiculo2, main.colaNivel1C2, main.colaNivel2C2, main.colaNivel3C2);
            System.out.println(vehiculo2.getNombre());
            System.out.println(vehiculo2.id);
            System.out.println(vehiculo2.calidad);
        } else {
            if (probs.nextInt(100) <= 80) {
                int carroceria1 = CalidadVehiculo(2, carroceriaProb, 60);
                total += carroceria1;

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
                total += ruedas2;

                Vehiculos vehiculo2 = retornarVehiculoAgregado(total, 2);
                vehiculo1.setNombre("Lamborghini");
                vehiculo1.setInfo("1 carroceria, 2 chasis, 6 motores, 5 ruedas");
                colaNivel(vehiculo2, main.colaNivel1C2, main.colaNivel2C2, main.colaNivel3C2);
                System.out.println(vehiculo2.getNombre());
                System.out.println(vehiculo2.id);
                System.out.println(vehiculo2.calidad);
            }
        }

    }
    
    private Vehiculos desencolarVehiculo(Colas seleccCola, Colas seleccCola2, Colas seleccCola3) {
        if (seleccCola.getSize() > 0) {
            Vehiculos selecc = (Vehiculos) seleccCola.desencolar();
            selecc.resetContador();
            return selecc;
        } else if (seleccCola2.getSize() > 0) {
            Vehiculos selecc = (Vehiculos) seleccCola2.desencolar();
            selecc.resetContador();
            return selecc;
        } else if (seleccCola3.getSize() > 0) {
            Vehiculos selecc = (Vehiculos) seleccCola3.desencolar();
            selecc.resetContador();
            return selecc;
        } else {
            System.out.println("NO HAY VEHICULOS EN COLA");
            return null;

        }
    }
    
    public Vehiculos seleccVehiculo(int marca) {
        
        Vehiculos vehiculoSelecc = null;
        
        if (marca == 1) {
            
            Vehiculos desencolarVehiculo1 = desencolarVehiculo(main.colaNivel1C1, main.colaNivel2C1, main.colaNivel3C1);
            
            if (desencolarVehiculo1 == null) {
                System.out.println("No hay Vehiculos");
            } else {
                vehiculoSelecc = desencolarVehiculo1;
            }
                   
            Colas colaNivel2Aux = new Colas();           
            while (!main.colaNivel2C1.isEmpty()) {
                Vehiculos vehiculo;
                vehiculo = (Vehiculos) main.colaNivel2C1.desencolar();
                if (vehiculo.contador >= 8) {
                    vehiculo.resetContador();
                    vehiculo.setNivel(1);
                    Vehiculos vehi = new Vehiculos(vehiculo.id, vehiculo.nivel,vehiculo.calidad,vehiculo.marca);
                    vehi.setNombre(vehiculo.getNombre());
                    main.colaNivel1C1.encolar(vehi);
                } else {
                    vehiculo.sumContador();
                    colaNivel2Aux.encolar(vehiculo);
                }
            }
            main.colaNivel2C1 = colaNivel2Aux;
            
            Colas colaNivel3Aux = new Colas();            
            while (!main.colaNivel3C1.isEmpty()) {
                Vehiculos vehiculo;
                vehiculo = (Vehiculos) main.colaNivel3C1.desencolar();
                if (vehiculo.contador >= 8) {
                    vehiculo.resetContador();
                    vehiculo.setNivel(2);
                    Vehiculos vehi = new Vehiculos(vehiculo.id, vehiculo.nivel,vehiculo.calidad,vehiculo.marca);
                    vehi.setNombre(vehiculo.getNombre());
                    main.colaNivel2C1.encolar(vehi);
                } else {
                    vehiculo.sumContador();
                    colaNivel3Aux.encolar(vehiculo);
                }
            }
             main.colaNivel3C1 = colaNivel2Aux;
             
             Nodos primero = main.colaRefuerzo1.getFirst();
             for (int i = 0; i < main.colaRefuerzo1.getSize(); i++) {
                Vehiculos vehiculo = (Vehiculos) primero.getData();
                vehiculo.sumContador();
                primero = primero.getNext();
            }
            
        } else {
            
            Vehiculos desencolarVehiculo2 = desencolarVehiculo(main.colaNivel1C2, main.colaNivel2C2, main.colaNivel3C2);
            
            if (desencolarVehiculo2 == null) {
                System.out.println("No hay Vehiculos");
            } else {
                vehiculoSelecc = desencolarVehiculo2;
            }
                   
            Colas colaNivel2Aux = new Colas();           
            while (!main.colaNivel2C2.isEmpty()) {
                Vehiculos vehiculo;
                vehiculo = (Vehiculos) main.colaNivel2C2.desencolar();
                if (vehiculo.contador >= 8) {
                    vehiculo.resetContador();
                    vehiculo.setNivel(1);
                    Vehiculos vehi = new Vehiculos(vehiculo.id, vehiculo.nivel,vehiculo.calidad,vehiculo.marca);
                    vehi.setNombre(vehiculo.getNombre());
                    main.colaNivel1C2.encolar(vehi);
                } else {
                    vehiculo.sumContador();
                    colaNivel2Aux.encolar(vehiculo);
                }
            }
            main.colaNivel2C2 = colaNivel2Aux;
            
            Colas colaNivel3Aux = new Colas();            
            while (!main.colaNivel3C2.isEmpty()) {
                Vehiculos vehiculo;
                vehiculo = (Vehiculos) main.colaNivel3C2.desencolar();
                if (vehiculo.contador >= 8) {
                    vehiculo.resetContador();
                    vehiculo.setNivel(2);
                    Vehiculos vehi = new Vehiculos(vehiculo.id, vehiculo.nivel,vehiculo.calidad,vehiculo.marca);
                    vehi.setNombre(vehiculo.getNombre());
                    main.colaNivel2C2.encolar(vehi);
                } else {
                    vehiculo.sumContador();
                    colaNivel3Aux.encolar(vehiculo);
                }
            }
             main.colaNivel3C2 = colaNivel2Aux;
             
             Nodos primero = main.colaRefuerzo2.getFirst();
             for (int i = 0; i < main.colaRefuerzo2.getSize(); i++) {
                Vehiculos vehiculo = (Vehiculos) primero.getData();
                vehiculo.sumContador();
                primero = primero.getNext();
            }
            
        }
        return vehiculoSelecc;

    }
    
    public void reEncolar(Vehiculos vehiculo) {
        
        switch (vehiculo.marca) {
            case 1: {
                colaNivel(vehiculo, main.colaNivel1C1, main.colaNivel2C1, main.colaNivel3C1);
                break;
            }
            case 2: {
                colaNivel(vehiculo, main.colaNivel1C2, main.colaNivel2C2, main.colaNivel3C2);
                break;

            }
            default: {
                break;
            }
        }
               
    }
    
    public void encolarRefuerzo(Vehiculos vehiculo) {

        switch (vehiculo.marca) {
            case 1: {
                main.colaRefuerzo1.encolar(vehiculo);
                break;
            }
            case 2: {
                main.colaRefuerzo2.encolar(vehiculo);
                break;

            }

        }
    }
    
    public void desencolarRefuerzo() {

        Random probabilidad = new Random();

        int probabilidad1 = probabilidad.nextInt(100);
        int probabilidad2 = probabilidad.nextInt(100);

        if (main.colaRefuerzo1.getSize() > 0 && probabilidad1 <= 40) {
            Vehiculos vehiculo = (Vehiculos) main.colaRefuerzo1.desencolar();
            reEncolar(vehiculo);//revisar como mandarlo a la cola 1
        }

        if (main.colaRefuerzo2.getSize() > 0 && probabilidad1 <= 40) {
            Vehiculos vehiculo = (Vehiculos) main.colaRefuerzo2.desencolar();
            reEncolar(vehiculo);//revisar como mandarlo a la cola 1
        }
    }

}
