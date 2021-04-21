

package com.mycompany.lista02;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        Double nota1, nota2, media;
        
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        
        System.out.println("Digite sua primeira nota:");
        nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = leitor.nextDouble();
        
        media = (nota1 * 0.4) + (nota2 * 0.6);
        
         System.out.println(String.format("Olá %s. Sua média foi de %.2f", nome, media));
    }
}
