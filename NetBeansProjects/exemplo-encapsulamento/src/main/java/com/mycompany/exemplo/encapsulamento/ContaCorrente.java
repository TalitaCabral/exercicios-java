/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.encapsulamento;

public class ContaCorrente {
    
    
    // Atributos
    private Double saldo = 0.0;
    private Double limiteSaldo = 1000.0;
    
    // Métodos
    
    public void depositar(Double valor) {
        if (saldo + valor > limiteSaldo) {
            System.out.println("Não é possível efetuar esse depósito");
        }
        else {
            saldo += valor;
        }
    }
    
    
    public void sacar(Double valor) {
        if (saldo - valor < 0.0) {
            System.out.println("Não é possível efetuar esse saque");
        }
        else {
            saldo -= valor;
        }
    }
    
    //Metodo obtemSaldo() - usado por outra classe para obter o saldo
    public Double obtemSaldo(){
        return saldo;
    }
    
    //Metodo configuraSaldo() - usado por outra classe para configurar o saldo
    public void configuraSaldo(Double saldo) {
        if (saldo < 0 || saldo > limiteSaldo){
            System.out.println("Valor de saldo invalido");
        }
        else {
            this.saldo = saldo;
        }
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaldo() {
        return limiteSaldo;
    }

    public void setLimiteSaldo(Double limiteSaldo) {
        this.limiteSaldo = limiteSaldo;
    }
    
    
}





