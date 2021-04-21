
package com.mycompany.lista03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer numero;
         
         System.out.println("Digite um número:");
         numero = leitor.nextInt();
         
         System.out.println("Tabuada do " + numero + ":");
         
         for (Integer i = 0; i <= 10; i++) {
         System.out.println(numero + " x " + i + " = " + numero * i);
        }  
    }
}
