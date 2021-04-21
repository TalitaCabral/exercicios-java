
package com.mycompany.lista03;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.println("Digite o seu nome de usuário: ");
            usuario = leitor.next();
            
            System.out.println("Digite sua senha: ");
            senha = leitor.next();
            
            if ("admin".equals(usuario) && "#Bandtec".equals(senha)) {
                System.out.println("Login realizado com sucesso");
           
            } else {
                System.out.println("Login e/ou Senha invalidos\nTente novamente!");
            }
            
        } while (!"admin".equals(usuario) && !"#Bandtec".equals(senha));
    }
}
