package listasSimples;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Nodo {

    private double Dato;
    private Nodo Siguiente;
    
    public Nodo() {
        Dato = 0;
        Siguiente = null;
    }

    public double getDato() {
        return Dato;
    }

    public void setDato(double Dato) {
        this.Dato = Dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    
    
}
