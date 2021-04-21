
package com.mycompany.lista03;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer base, expoente;
        
        do {
            System.out.println("Digite o número da base: ");
            base = leitor.nextInt();
            
            System.out.println("Digite o número do expoente: ");
            expoente = leitor.nextInt();
        } while (base <= 0 || expoente <= 0);
        
        Integer b;
        b = base;
        for (Integer i = 1; i < expoente; i++) {
            base = base  * b;
        }
        System.out.println("O valor é da base é: " + base);
    
    }
}
