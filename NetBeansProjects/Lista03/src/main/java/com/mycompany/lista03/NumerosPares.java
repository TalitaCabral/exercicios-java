
package com.mycompany.lista03;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer cont = 0;
         
         System.out.println("Exiba os números pares de 0 a 40");
         cont = leitor.nextInt();
         
         while (cont <= 40) {
             System.out.printf("\nPares: %d", cont);
             cont += 2; 
             
         }
    }
}
