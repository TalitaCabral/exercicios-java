/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica04;

import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
       
        Integer idade, numeroInt;
        
        System.out.println("Digite sua idade");
        idade = leitor.nextInt();
        classificaIdade(idade);

        System.out.println("_____________________");
        potencia();
        System.out.println("_____________________");

        System.out.println("Digite um numero inteiro");
        numeroInt = leitor.nextInt();

        exibeDivisores(numeroInt);
    }

    public static void classificaIdade(Integer idade) {
        if (idade <= 2) {
            System.out.println("Bebê");
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        }

    }

    private static void exibeDivisores(Integer numeroInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void potencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
