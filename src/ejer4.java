
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
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cr4ear una aplicacion para hallar el area y el perimetro del rectangulo
        Scanner ejer4=new Scanner(System. in);
        double b, a,area,peri ;  
        System.out.println("ingrese la base del rectangulo");
       b=ejer4.nextDouble(); 
        System.out.println("ingrese la altura  del rectangulo");
       a=ejer4.nextDouble();
       
        area=b*a ;
        peri=(b*2)+(a*2);
        
        System.out.println("el area del rectangulo es : " + area);
        System.out.println("el perimetro del rectangulo es : " + peri);
    }
    
}
