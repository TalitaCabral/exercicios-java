/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
    }
    public static void potencia() {
        
        Scanner leitor = new Scanner(System.in);
        
        Double base, expoente, potencia;

        System.out.println("Digite a base");
        base = leitor.nextDouble();
        potencia = base;

        System.out.println("Digite o expoente");
        expoente = leitor.nextDouble();

        for (Integer i = 1; i < expoente; i++) {
            potencia = potencia * base;
        }

        System.out.println(potencia);

    }

    public static void exibeDivisores(Integer numeroInt) {
        for (Integer i = 1; i <= numeroInt; i++) {
            if (numeroInt % i == 0) {
                System.out.println(i);
            }
        }
    }
}

