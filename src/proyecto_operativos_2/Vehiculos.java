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
public class Vehiculos {
    
    public int id = 0;
    public int nivel = 0;
    public int contador = 0;
    public int calidad = 0;
    public int marca = 0;
    public int puntos;
    public String nombre = "";
    public String info = "";
    public boolean estado; 
    
    public Vehiculos (int id, int nivel, int calidad, int marca){
        
        this.id = id;
        this.nivel = nivel;
        this.contador = 0;
        this.calidad = calidad;
        this.marca = marca;
        this.puntos = PiezasIlicitas.piezasPts();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info){
        this.info = info;
    }
    
    public void setCalidad(int calidad){
        this.calidad = calidad;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void sumContador(){
        this.contador++;
    }
    
    public void resetContador(){
        this.contador = 1;
    }
}
