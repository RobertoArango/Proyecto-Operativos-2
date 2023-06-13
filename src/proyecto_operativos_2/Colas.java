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
public class Colas<T> {
    
    private Nodos <T> first;
    private Nodos <T> last;
    private int size;
    
    public Colas() {
        this.first = null;
        this.last = null;
        this.size = 0;
        
    }
    
    public Colas(T datum) {
        Nodos<T> n = new Nodos(datum);
        this.first = n;
        this.last = n;
        this.size = 1;
    }
    
    public boolean isEmpty() {
        return this.first == null;
    }
    
    public void encolar(T datum) {
        Nodos<T> n = new Nodos(datum);
        this.size += 1;
        if (isEmpty()) {
            this.first = this.last = n;
        } else {
            this.last.setNext(n);
            this.last = n;        
        }
    }
    
   public T desencolar() {
       if (isEmpty()) {
           return null;
       }
       
       Nodos<T> aux = this.first;
       this.first = aux.getNext();
       aux.setNext(null);
       this.size -=1;
       return aux.getData();
   }
    
   public T peek() {
       if (isEmpty()){
           return null;
       }
       
       Nodos<T> aux = this.last;
       return aux.getData();
   }

    public Nodos<T> getFirst() {
        return first;
    }

    public Nodos<T> getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }
}
