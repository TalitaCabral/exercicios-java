/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Scanner;

public class ProblemaComScanner {
    
    public static void main(String[] args) {
        //Criação do objeto leitor da class Scanner
        Scanner leitor = new Scanner(System.in);
        
        //Apenas para ler ...
        Scanner leitorNL =  new Scanner(System.in);
        
        
        String nome;
        Integer num1, num2, num3;
        
        // Quando pedimos para o usuário digitar um valor que não é texto ou qdo usa o next()
        // e em seguida usamos o nextLine() para ler um texto
        System.out.println("Digite um número inteiro");
        num1 = leitor.nextInt();
        
        System.out.println("Digite seu nome");
        nome = leitorNL.next();
        
        System.out.println("Digite outro número inteiro");
        num2 = leitor.nextInt();
        
        System.out.println("Digite 3 números");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        num3 = leitor.nextInt();
        
        System.out.println(String.format("num1= %d\nnum2= %d\nnum3= %d",
                           num1, num2, num3));


        
    }
    
}
