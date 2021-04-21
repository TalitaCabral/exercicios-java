/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

public class Colaborador {
    String nome, cargo;
    Double salario;
    
    //Metodo
    public void exibeDados(){
        System.out.println("\nDados do colaborador:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println(String.format("Salario: R$ %.2f", salario));
    }
    
}
