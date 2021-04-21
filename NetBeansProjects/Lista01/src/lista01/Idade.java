
package lista01;

import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
  
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o seu nome");
    String nome = leitor.nextLine();
    
    Integer idade, anoNascimento;
    System.out.println("Olá," + nome + "! Qual o ano de seu nascimento?");
    anoNascimento = leitor.nextInt();
    
    idade = 2030 - anoNascimento;
    System.out.println("Em 2030 você terá " + ( 2030 - anoNascimento) + " anos");

 }
}
