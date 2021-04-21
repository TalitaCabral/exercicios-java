
package com.mycompany.lista02;

import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer aquecimento, exAerobicos, musculacao, tempo, percaCalorias;

        System.out.println("Digite em minutos, quanto tempo você passou se aquecendo:");
        aquecimento = leitor.nextInt();
        System.out.println("Digite em minutos, quanto tempo você passou fazendo exercícios aeróbicos:");
        exAerobicos = leitor.nextInt();
        System.out.println("Digite em minutos, quanto tempo você passou fazendo musculação:");
        musculacao = leitor.nextInt();

        tempo = aquecimento + exAerobicos + musculacao;
        percaCalorias = (aquecimento * 12) + (exAerobicos * 20) + (musculacao * 25);

        System.out.println(String.format("Olá Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", tempo, percaCalorias));

    }
}
