/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_operativos_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Vito
 */

//Las empreseas de vehiculos para tener mas posibilidades idearon utilizar piezas ilicitas
//que mejoren el rendimiento a la hora de la carrera, cada pieza tendra un puntaje que
//se le sumara a un total, con esto se decidira el ganador

public class PiezasIlicitas {
    
    
    String[] piezas = {
        "Oxido nitroso", //0
        "Super cargador", //1
        "Turbocompresor", //2
        "Charge cooler", //3
        "Escape deportivo", //4
        "Reprogramacion del ECU", //5
        "Intercooler", //6
        "Suspension deportiva", //7
        "Suspension original", //8
        "Filtro de aire", //9
        "Filtro de aire original", //10
        "Fibra de carbono", //11
        "Carroceria original", //12
        "Neumaticos suaves anchos", //13
        "Neumaticos original", //14
        "Motor original"}; //15
    
    public static boolean usando(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
    
    public static int piezasPts() {
        int pts = 0;
        int i = 0;
        
        //hay 3 categorias de piezas dependiendo de su impacto en el carro
        // OG = piezas originales - S = piezas con mejora considerable - SS + piezas con gran impacto 
        
        int [] SS = {2,1,0};
        int [] S = {3,4,5,6,7,9,11,13};
        int [] OG = {15,14,12,10,8};
        

        while (i < 5) {
            int rand = ThreadLocalRandom.current().nextInt(0, 15);
       
            if(usando(SS,rand)){
                pts += 8;
            }else if(usando(S,rand)){
                pts += 4;
            }else if(usando(OG,rand)){
                pts += 1;
            }
           
            i++;
        }
        return pts;
    }
            
}
