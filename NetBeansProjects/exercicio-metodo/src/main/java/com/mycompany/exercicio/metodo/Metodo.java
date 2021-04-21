/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.metodo;

import java.util.Scanner;

public class Metodo {
    
    public static void leExibeMedia(Integer n) {
        Integer soma = 0, numero;
        Double media;
        Scanner leitor = new Scanner(System.in);
        
        for (Integer i = 0; i < n; i++) {
            System.out.println("Digite um número inteiro");
            numero = leitor.nextInt();
            soma += numero;
           //instrução equivalente a anterior
           //soms = soma + numero;
        }
        
        media = Double.valueOf(soma) / n;
       
        //casting: força que uma variável seja considerada
        //como sendo de outro tipo - no caso abixo estou
        //forçando que a variavel soma seja vista como um valor
        //double (tipo primitivo
        //media = (double) soma / n;
    }
}
