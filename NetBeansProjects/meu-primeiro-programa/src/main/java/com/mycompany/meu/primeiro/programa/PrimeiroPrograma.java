/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meu.primeiro.programa;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class PrimeiroPrograma {
    
    public static void main(String[] args) {
        
    /* \n é uma quebra de linha   */
    /* \t é um TAB  */
    // print - serve para exibir a mensagem e continua na mesma linha
    // println - serve para exibir a mensagem e já muda para a prox linha

        System.out.println("Boa \t Noite!");
        
        System.out.print("Tudo bem?");
        System.out.println("Bem vindo à turma 2ADSA");
        
        System.out.println("Como vai, " + args[0] + "?" );
        
        // Declarando uma variável do tipo texto
        String nome;
        nome = "Tali"; // atribuição - String é sempre delimitado por aspas duplas
        System.out.println("O nome dela é " + nome);
        
        //Criação de um objeto para ler dados do teclado
        Scanner leitor = new Scanner(System.in);
        
        //Solicitar que o usuário digite o nome
        System.out.println("Digite o seu nome");
        nome = leitor.nextLine(); // next() é o método utilizado para ler uma palavra
                                  // nextLine() método para ler até o final da linha
        System.out.println("Bem-vindo, " + nome);
        
        Integer idade, anoNascimento; //Integer significa inteira
        System.out.println("Digite a sua idade");
        idade = leitor.nextInt(); //nextInt() é o método utilizado para ler valores inteiros
        System.out.println("A sua idade é " + idade);
        anoNascimento = 2021 - idade;
        System.out.println("Você nasceu em " + anoNascimento);
    }
}
