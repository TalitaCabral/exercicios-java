
package com.mycompany.lista03;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer numero, soma = 0;

        System.out.println("Digite um número! Caso queira desistir, digite 0");
        numero = leitor.nextInt();
        soma += numero;

        while(numero != 0) {
            System.out.println("Digite um número! Caso queira desistir, digite 0");
            numero = leitor.nextInt();
            soma += numero;
        }
        System.out.println("Total da soma de números foi: "  + soma);
    }
}

