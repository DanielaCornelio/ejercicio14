
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear una aplicacion que lea la longitud de 
        //un cateto de un triangulo rectangulo que calcule la hipotenusa
      Scanner ejer3 = new Scanner(System.in);
   
      double c1, c2 ,h;
      System.out.println("ingrese el cateto");
       c1=ejer3.nextDouble();       
     System.out.println("ingrese el cateto opuesto");
       c2=ejer3.nextDouble();
       h=Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
        System.out.println("la hipotenusa es : " + h);
    }
    
}
