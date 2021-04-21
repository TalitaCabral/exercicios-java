
package com.mycompany.lista03;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer mussarela = 0, calabresa = 0, quatroQueijos = 0, contagem = 0, numero;
        
        while (contagem < 10) {
            System.out.println("Qual seu sabor de pizza preferido?\n"
                               + "5 para Mussarela\n"
                               + "25 para Calabresa\n"
                               + "50 para 4 Queijos\n"
                               + "Digite: ");
            numero = leitor.nextInt();
            contagem++;
       
         if (numero == 5) {
                mussarela++;
            } else if (numero == 25) {
                calabresa++;
            } else if (numero == 50) {
                quatroQueijos++;
            } 
        
        System.out.printf("O sabor de mussarela teve %d votos: \n", mussarela);
        System.out.printf("O sabor de calabresa teve %d votos: \n", calabresa);
        System.out.printf("O sabor de 4 Queijos teve %d votos: \n", quatroQueijos);
         
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("Sabor favorito é: mussarela");
            
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("Sabor favorito é: calabresa");
            
        } else {
            System.out.println("O sabor favorito é: 4 Quatro-queijos");
        }
    }
}} 

