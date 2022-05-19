/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasSimples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Principal {
    
    private Listas mListas;
    private Nodo mNodo;
    private Interfaz mInterfaz;
    static double media;
    static double varianza;
    static double desviacion;
    

    public Principal() {
        mListas = new Listas();
        mNodo = new Nodo();
        mInterfaz = new Interfaz();
        
    }
    public void correr() throws IOException
    {
        int opcion = 0;
        do{
            mInterfaz.ImprimirMenu();
            opcion = mInterfaz.GetOpcion();
            
            if(opcion == 1){
                double num;
                Scanner numero = new Scanner(System.in);
                System.out.println("Ingrese un Numero a la Lista: ");
                num = numero.nextDouble();
                mListas.agregar(num);
                System.out.println("Se agrego a la lista");
            }
            if (opcion == 2){
                mNodo =  mListas.getInicio();
                if(mNodo !=  null){
                    
                
                    System.out.println("---Lista de Datos---");

                    while(mNodo != null){
                        System.out.println(mNodo.getDato());
                        mNodo = mNodo.getSiguiente();
                    }
                }else{
                    System.out.println("No hay datos que Mostrar");
                }
            }
            if (opcion == 3){
                double suma= 0;
                int cont = 0;
                
                
                mNodo =  mListas.getInicio();
                if(mNodo !=  null){
                    while(mNodo != null){

                        suma = suma + mNodo.getDato();
                        mNodo = mNodo.getSiguiente();
                        cont ++;
                    }
                    media = suma/cont;
                    System.out.println("La Media es: "+ media);
                }else{
                    System.out.println("No hay datos que Sumar");
                }
            }
            if (opcion == 4){
                int cont =0;
                mNodo =  mListas.getInicio();
                if(mNodo !=  null){
                    while(mNodo != null){
                        double sumatoria;
                        sumatoria = Math.pow(mNodo.getDato()- media, 2);
                        mNodo = mNodo.getSiguiente();
                        varianza = varianza +sumatoria;
                        cont ++;
                       
                    }
                    varianza = varianza / (cont-1);
                    desviacion= Math.sqrt(varianza);
                    double redondeo = Math.rint(desviacion*100)/100;
                    
                    System.out.println("La desviación Estandar es: "+ redondeo);
                    
                }else{
                    System.out.println("No hay datos en la Lista");
                }
            }
             if (opcion == 5){
                 int cont=  0;
                mNodo =  mListas.getInicio();
                if(mNodo !=  null){
                    
                
                    System.out.println("---Lista de Datos---");
                     try (FileWriter fichero = new FileWriter("C:/Users/ASUS/Desktop/CDC/datos.txt")) {
                         while(mNodo != null){
                             System.out.println(mNodo.getDato());
                             mNodo = mNodo.getSiguiente();
                             cont ++;
                             
                             fichero.write(cont + (int) mNodo.getDato());
                         }}
                   
                }
                
                else{
                    System.out.println("No hay datos que Mostrar");
                }
            }
            
            if (opcion == 6){
                System.out.println("Adios");
                System.exit(0);
            }
        }while(opcion != 5);
    }
    

    public static void main (String[] args) throws IOException{
//        Listas mLista;
//        Nodo mNodo;
//        Interfaz minterfaz;
//        
//        minterfaz = new Interfaz();
//        minterfaz.ImprimirMenu();
//        
//        mLista = new Listas();
//        mLista.agregar(8);
//        mLista.agregar(7);
//        mLista.agregar(6);
//        mLista.agregar(5);
//        mLista.agregar(4);
//        mLista.agregar(3);
//        
//        mNodo =  mLista.getInicio();
//        while(mNodo != null){
//            System.out.println(mNodo.getDato());
//            mNodo = mNodo.getSiguiente();
//        }
//    }
        Principal mPrincipal=  new Principal();
        mPrincipal.correr();
    }
}   
