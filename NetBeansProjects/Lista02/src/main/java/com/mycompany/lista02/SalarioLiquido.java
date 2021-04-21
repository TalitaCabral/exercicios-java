package com.mycompany.lista02;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
         
        Scanner leitor = new Scanner(System.in);
         
        Double salarioBruto, inss, ir, vt, conducao, salarioLiquido, desconto;
        
        System.out.println("Digite seu salário bruto:");
        salarioBruto = leitor.nextDouble();
        
        System.out.println("Digite o custo de sua condução diária de ida para o  trabalho:");
        conducao = leitor.nextDouble();
        
        inss = ((10 * salarioBruto) / 100);
        
        ir = ((20 * salarioBruto) / 100);
        
        vt = (conducao * 2) * 22;
        
        desconto = inss + ir + vt;
        
        salarioLiquido= salarioBruto - inss - ir - vt;
        
        System.out.println(String.format("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salarioBruto, desconto, salarioLiquido));

        
    }
}

