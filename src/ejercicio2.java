
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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear una aplicacion que permita obtener el pago total de una compra
        Scanner ejer2 = new Scanner(System.in);
        double compra, cantidad,preciofinal ;
        System.out.println("ingrese el precio del producto");
        compra=ejer2.nextDouble();
        System.out.println("ingrese cantidad del producto ");
        cantidad=ejer2.nextDouble();
        
        preciofinal=cantidad*compra;
        
        System.out.println("el PAGO TOTAL de las compras es : " + preciofinal);
        
    }
    
}
