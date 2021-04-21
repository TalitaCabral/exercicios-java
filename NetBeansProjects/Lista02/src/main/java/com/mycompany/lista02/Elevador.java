
package com.mycompany.lista02;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args){
        
        //Criação do objeto da classe Scanner
        Scanner leitor = new Scanner(System.in);
        
        Double pesoMax, peso1, peso2, peso3, pesoTotal;
        Integer limiteMaximo;
 
        System.out.println("Qual o limite de peso no elevador?"); 
        pesoMax = leitor.nextDouble();
        
        System.out.println("Qual o limite de pessoas no elevador?"); 
        limiteMaximo = leitor.nextInt();
        
        System.out.println("Qual o peso da 1° pessoa?"); 
        peso1 = leitor.nextDouble();
        System.out.println("Qual o peso da 2° pessoa?"); 
        peso2 = leitor.nextDouble();
        System.out.println("Qual o peso da 3° pessoa?"); 
        peso3 = leitor.nextDouble();
        
        pesoTotal = peso1 + peso2 + peso3;
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d", pesoMax));
        System.out.println(String.format("O peso total no elevador é de %.2f, sendo que ele suporta %.2f", pesoTotal, limiteMaximo));
        
 
        
        
        
        
        
        
        
    
    
    
    
    }
}
