/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolarapesochileno;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class DolaraPesochileno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     int pesoschilenos,valor,Pesochileno;
    Solicitarvalor();
    valor=Capturarvalor();
    Pesochileno=Calcularpesoschilenos(valor);
     Mostrarvalor(Pesochileno);
    
    }
     public static void Solicitarvalor() {
    System.out.println("Ingrese valor del producto en dolares :");
    
}  
     public static int Capturarvalor(){
         Scanner capturarvalor=new Scanner(System.in);
         int valor=capturarvalor.nextInt();
         return valor;
      }

     public static int Calcularpesoschilenos(int valor){
           return   valor*618;
         
     }
     
     public static void Mostrarvalor(int Pesochileno){
         System.out.println("EL valor en pesos chilenos es : " +"$ " + Pesochileno);
     }
       
}
