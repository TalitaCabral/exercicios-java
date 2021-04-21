
package com.mycompany.lista03;

import java.util.Scanner;

public class ContadorVariado {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Double numero = 0.15;

        for (Integer i = 1; numero <= 5; i++) {
            System.out.printf("\nContagem: %.2f", numero);
            numero += 0.15;
        }
    }
}
