
package com.mycompany.lista03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer numero, numSorteado, tentativas = 0;
         
         while (tentativas <= 100) {
         System.out.println("Digite um número entre o e 10:");
         numero = leitor.nextInt();
         
         numSorteado = ThreadLocalRandom.current().nextInt(0, 10);
         System.out.println("Números Sorteados:" + numSorteado);
         tentativas ++;

            if (numero == numSorteado) {
                  if (tentativas <= 3) {
                    System.out.println("Você é MUITO sortudo");
                    break;
                } else if (tentativas <= 10) {
                    System.out.println("Você é sortudo");
                    break;
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                    break;
                }
            }    
        }
    }
}
