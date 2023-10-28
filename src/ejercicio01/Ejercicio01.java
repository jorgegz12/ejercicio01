/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        System.out.println("Digite el primer valor:");
        valor1 = scan.nextInt();
        System.out.println("Digite el segundo valor:");
        valor2 = scan.nextInt();
        if (valor1 > valor2){
            System.out.println("El primer valor es el mayor:\n" + valor1 );
        } else {
            System.out.println("El segundo valor es el mayor: \n" + valor2 );
        }   
    }
    
}
