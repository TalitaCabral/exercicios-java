/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.encapsulamento;

public class Teste {

     public static void main(String[] args) {
        
        
        // Instanciar a classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println("O saldo inicial da conta1 é " + conta1.obtemSaldo());

        conta1.depositar(500.0);
        System.out.println("O saldo da conta1 é " + conta1.obtemSaldo());

        conta1.sacar(200.0);
        System.out.println("O saldo da conta1 é " + conta1.obtemSaldo());
        
        conta1.depositar(1000.0);
        conta1.sacar(500.0);
        
        // atribuindo valores indevidos ao saldo da conta1
        conta1.configuraSaldo(-500.0);
        System.out.println("O saldo da conta1 é " + conta1.obtemSaldo());
        
        conta1.configuraSaldo(1500.0);
        System.out.println("O saldo da conta1 é " + conta1.obtemSaldo());
        
        
    }
    

}
