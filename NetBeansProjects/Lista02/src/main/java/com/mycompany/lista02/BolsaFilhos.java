
package com.mycompany.lista02;

import java.util.Scanner;

public class BolsaFilhos {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         Integer filhos0, filhos4, filhos17, totalFilhos;
         Double bolsaFilhos;
         
         System.out.println("Quantos filhos de 0 a 3 anos possui?");
         filhos0 = leitor.nextInt();
         
         System.out.println("Quantos filhos de 4 a 16 anos possui?");
         filhos4 = leitor.nextInt();
         
         System.out.println("Quantos filhos de 17 a 18 anos possui?");
         filhos17= leitor.nextInt();
         
         totalFilhos = filhos0 + filhos4 + filhos17;
         bolsaFilhos = (filhos0 * 25.12) + (filhos4 * 15.88) + (filhos17 * 12.44);
        
         System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, bolsaFilhos));
    }
}
