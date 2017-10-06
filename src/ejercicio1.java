
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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear una aplicacion que me permita  crear el igv deacuerdo al costo de compra y mostrar el monto global de la compra
    Scanner obj= new Scanner(System.in);
    double comp, igv, total;
    System.out.println("ingrese el precio de compras");
    comp=obj.nextDouble();
    igv=comp*0.18;
    total=comp+igv;
    System.out.println("el precio FINAL de compras es : " + total);
    
            
        
    }
    
}
