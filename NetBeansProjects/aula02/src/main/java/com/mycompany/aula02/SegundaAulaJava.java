/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Scanner;

public class SegundaAulaJava {
    
    public static void main(String[] args) {
        
        //Criação do objeto da classe Scanner
        Scanner leitor = new Scanner(System.in);
        
        //Criação de variável real (com casas decimais)
        Double nota1, nota2, divisao, media;
        
        //Criação de variáveis inteiras
        Integer num1, num2, resultado;
        
        //Criação de variaveis String para (texto)
        String snum1, snum2, faculdade;
        
        //Criação de variavel booleana (recebe to ou false)
        Boolean aprovado;
        
        //Divisão de números inteiros 
        num1 = 9;
        num2 = 2;
        resultado = num1 / num2;
        System.out.println("Resultado = " + resultado);
        //Para fazer a divisão com casas decimais, preciso converter um
        //o valor de num1 OU o valor de num2 para Double antes da divisão
        divisao = Double.valueOf(num1) / num2;
        System.out.println("Divisão = " + divisao);
        
        /*Para que um numero seja considerado Double, basta adicionar
        .0, como no exemplo a seguir: */
        divisao = 1.0 / 2;
        System.out.println("Divisão = " + divisao);
        
        //Leitura de valor real (DOUBLE)
        System.out.println("Digite a sua nota1");
        nota1= leitor.nextDouble();
        System.out.println("Digite a sua nota2");
        nota2= leitor.nextDouble();
        
        //Cálculo da média 
        media = (nota1 + nota2) /2;
        
        //Exibi a média
        System.out.println("A média é " + media);
        
        //Interpolação
        //String.format("texto", variavel1, variavel2, etc)
        //No lugar do "texto", uso formatos para definir como deve ser
        //Exibido o valor da variavel
        // %f - para exibir números reais (com casas decimais)
        // %d - para exibir numeros inteiros
        // %s - para exibir texto (String)
        // %.2f - para exibir números reais com 2 casas decimais
        // %.1f - para exibir números reais com 1 casa decimal
        
        System.out.println(String.format("A média é %.2f", media));
        System.out.println(String.format("Nota1: %.2f, Nota2: %.2f, Média: %.1f",
                                          nota1, nota2, media));
          
        //Conversão de String para Integer
        snum1 = "10";
        // o caracter '1' corresponde em código ASCILL ao valor 31H
        // 31H é 00110001 em binario
        // o número 1 é 00000001 em binario
        num1 = Integer.valueOf(snum1);
        resultado = num1 + num2;
        System.out.println("Resultado = " + resultado);
        
        // Conversão de String para Double
        snum2 = "7.5";
        nota1 = Double.valueOf(snum2);
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        
        //if sem else
        if (media >= 6.0){
            System.out.println("Aprovado");
        }
        
        if (media >= 6.0){
            aprovado = true;
    }
        else {
            aprovado = false;
        }
        
        //Comparando a variável booleana
        //não se costuma usar: if (aprovado == true), pois é redundante
        if (aprovado){
            System.out.println("Você pode cursar o 3o semestre");
        }
        
        //Não se costuma usar: if (aprovado == false)
        if (!aprovado){
            System.out.println("Você terá que repetir o 2o Semestre");
        }

        // Para comparar valores numéricos, utilizamos == para ver se é igual
        // e != para ver se é diferente
        
        // Para comparar valores String, é melhor usar o método .equals
        if (snum1.equals("10")) {
            System.out.println("Acertou");
        } 
        
        // Para ver se a String é diferente:
        if (!snum1.equals("10")) {
            System.out.println("Errou");
        }
        
        System.out.println("Digite o nome da sua faculdade");
        faculdade = leitor.next();
        
        if (!faculdade.equals("Bandtec")) {
            System.out.println("Má escolha!");
        }
        
        // Como estamos usando Integer para inteiro e Double para nro real,
        // Podemos usar .equals para compara inteiro e real
        if (num1 == 5) {
            
        }
        
        if (num1.equals(5)) {
            
        }
        
        if (num1 != 5){
            
        }
        
        if (!num1.equals(5)) {
            
        }
        
        
        // Em Java, como no JavaScript utilizamos || para OU 
        // && para E ou AND
        if (num1 >= 0 && num1 <= 10) {
            System.out.println("num1 está dentro dos valores válidos");
        }
        
        if (num1 < 0 || num1 > 10) {
            System.out.println("num1 fora dos valores válidos");
        }
        
        // Operação módulo - fornece o resto de uma divisão inteira
        // em Java, usamos o símbolo de %
         if (num1 % 2 == 0) {
            System.out.println("num1 é par");
        }
        else {
            System.out.println("num1 é ímpar");
        }
            
        // Operador ternário funciona em Java como no JavaScript
        String mensagem = media >= 6.0 ? "Aprovado" : "Reprovado";
               
    } 
}
