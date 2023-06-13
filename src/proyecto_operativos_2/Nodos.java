/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_operativos_2;

/**
 *
 * @author Vito
 * @param <T>
 */
public class Nodos<T> {
    
    private T data;
    private Nodos next;
  
    public Nodos (T datum) {
        this.data = datum;
        this.next = null;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }

    public Nodos getNext() {
        return next;
    }
    
    public void setNext(Nodos next) {
        this.next = next;
    }   
}
