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
    
    private Vehiculos retornarVehiculoAgregado(int calidad, int marca, boolean estado){
        //estos valores son placeholders, mas adelante cuando detallemos la sumatoria de calidades se dictara rl valor condicional
        if (calidad <= 1) {
            int id = //hay que dirigirlo al id del main
            Vehiculos vehiculo = new Vehiculos(id, 3, calidad, marca, estado);
            return vehiculo;
            
        } else if (calidad >= 2 && calidad <= 3){
            int id = //hay que dirigirlo al id del main
            Vehiculos vehiculo = new Vehiculos(id, 2, calidad, marca, estado);
            return vehiculo;
            
        } else { 
            int id = //ha que dirigirlo al id del main
            Vehiculos vehiculo = new Vehiculos(id, 1, calidad, marca, estado);
            return vehiculo;
        }
        
    }
    
}
