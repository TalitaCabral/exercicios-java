
package lista01;

import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero1, numero2, resultado1, resultado2, resultado3;
        
        System.out.println("Digite um número:");
        numero1 = leitor.nextInt();
        
        System.out.println("Digite outro número:");
        numero2 = leitor.nextInt();
        
        resultado1 = numero1 + numero2;
        System.out.println("Resultado da soma: " + resultado1);
        
        resultado2 = numero1 - numero2;
        System.out.println("Resultado da subtração: " + resultado2);
        
        resultado3 = numero1 * numero2;
        System.out.println("Resultado da multiplicação " + resultado3);
           
    }
}
