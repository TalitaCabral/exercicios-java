
package com.mycompany.lista02;

import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
         
        Integer quantidade;
        Double valorUni, valorPago, valorCompra, troco;
        
        System.out.println("Solicite o valor unitario do produto?");
        valorUni = leitor.nextDouble();
        
        System.out.println("Solicite a quantidade vendida?");
        quantidade = leitor.nextInt();
        
        System.out.println("Solicite o valor pago pelo cliente:");
        valorPago = leitor.nextDouble();
        
        //Calculo
        valorCompra = valorUni * quantidade;
        troco =   valorPago - valorCompra; 
        
        System.out.println(String.format("Seu troco será de R$%.2f", + troco ));       
    }
}
