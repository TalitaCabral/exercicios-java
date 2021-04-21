
package com.mycompany.lista03;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer cont = 0;
        
        System.out.println("Exiba todos os números ímpares entre 0 a 90:");
        cont = leitor.nextInt();
        
        for (Integer i = 1; i <= 90; i +=2) {
            System.out.printf("\nImpares: %d", i);
        }
        
    }
}
