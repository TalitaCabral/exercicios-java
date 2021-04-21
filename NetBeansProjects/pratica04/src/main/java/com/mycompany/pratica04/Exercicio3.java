/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica04;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void exibeDivisores(Integer num) {
        
        for (Integer i = num; i <= num; i--) {
            
            if (i.equals(0)){
                break;
            }
            
            if (num % i == 0) {
                System.out.println("divisivel por" + i);
            }
        }
    }
    
        public static void main(String[] args) {
        
            Scanner leitor = new Scanner(System.in);
            
            Integer num;
            
            System.out.println("Digite um número");
            num = leitor.nextInt();
            
            exibeDivisores(num);
    }
  
}
