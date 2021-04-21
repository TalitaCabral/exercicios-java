
package com.mycompany.lista02;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String login, senha;
        Integer erros;
        
        System.out.println("Digite seu login:");
        login = leitor.nextLine();
        
        System.out.println("Digite sua senha:");
        senha = leitor.nextLine();
        
        System.out.println("Digite a quantidade de vezes que será possivel errar a senha");
        erros = leitor.nextInt();
        
        System.out.println(String.format("Seu login é %s. E sua senha é %s. Você tem %d tentativas antes de ser bloqueado", login, senha, erros));
    }
}
