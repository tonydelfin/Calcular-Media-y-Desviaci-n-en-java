/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasSimples;

/**
 *
 * @author ASUS
 */
public class Listas {
    private Nodo Inicio;
    private Nodo Fin;

    public Listas() {
        Inicio = null;
        Fin = null;
    }
    
    public void agregar(double num)
    {
        Nodo mNodo;
        mNodo = new Nodo();
        mNodo.setDato(num);
        
        if(Inicio == null){
            Inicio = mNodo;
            Fin = mNodo;
        }else{
            Fin.setSiguiente(mNodo);
            Fin = mNodo;
        }
    }
    public Nodo getInicio()
    {
        return Inicio;
    }    
    
    
}
