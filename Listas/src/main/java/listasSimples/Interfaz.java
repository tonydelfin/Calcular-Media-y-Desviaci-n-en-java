/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasSimples;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Interfaz {
    private int Opcion;
    
    public void ImprimirMenu(){
        boolean correcto = false;
        
        do{
            try{
                Scanner Opc = new Scanner(System.in);
                System.out.println("--- Menu Opciones ---");
                System.out.println("1.Agregar a la lista");
                System.out.println("2.Listar Datos");
                System.out.println("3.Calcular Media de los Datos");
                System.out.println("4.Calcular Desviación de los Datos");
                System.out.println("5.Guardar");
                System.out.println("6.Salir");
                Opcion = Opc.nextInt();
                
                
                if(Opcion >6 | Opcion < 1){
                    System.out.println("No se encontro en las Opciones disponibles");
                }else{
                    correcto = true;
                }
                
                
            }catch (Exception error){
                System.out.println("Ingrese datos validos");
                correcto =false;
            }
            
        }while(correcto ==  false);
    }
    public int GetOpcion(){
        return Opcion;
    }
    
}
