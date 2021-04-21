
package com.mycompany.lista02;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double salario, imposto, valImposto, salarioLiq;
        
        System.out.println("Digite o seu salário:");
        salario = leitor.nextDouble();
        
        System.out.println("Digite sua porcentagem de imposto:");
        valImposto = leitor.nextDouble();
        
        imposto = ((valImposto * salario) / 100);
        salarioLiq = salario - imposto;
        
        System.out.println(String.format("Salário líquido é = R$%.2f", salarioLiq)); 
    }
}
