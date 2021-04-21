/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talita
 */
public class ExemploLista {
    public static void main(String[] args) {
        
        // ArrayList é uma classe do Java que simula o comportamento de um vetor (array)
        // List é uma interface do Java
        // ArrayList é uma das classes que implementam a interface List
        // A variável lista pode receber objetos de qualquer q implementa a interface List
        List<String> lista = new ArrayList<String>();
        
        // Adicionando elemento a lista
        lista.add("Olá");
        lista.add("Tudo bem?");
        lista.add("Sextou");
        lista.add("Graças a Deus é sexta-feira");
        lista.add("Partiu sabadão!");
        
        // Exibindo a lista
        System.out.println("Lista: " + lista);
        
        // Exibindo o tamanho da lsita
        System.out.println("Tamanho da lista: " + lista.size());
        
        // Consultando se a lista está vazia
        System.out.println("A lista está vazia? " + lista.isEmpty());
        
        // Exibindo o elemento que esta no indice 3
        System.out.println("Elemento do indice 3: " + lista.get(3));
        
        // Verificando se a lista contém o valor "Sextou!"
        System.out.println("Índice de Sextou!: " + lista.indexOf("Sextou!"));
        
        //Obtendo o indice do elemento "Sextou!"
        System.out.println("Indice de Sextou!: " + lista.indexOf("Sextou!"));
        
        //Exibindo a lista usando o for tradicional
        System.out.println("\nExibindo a lista pelo for tradicional:");
        for (int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        // Exibindo a lista usando o for aprimorado ou for enhanced
        System.out.println("\nExibindo a lista pelo for enhanced:");
        for ( String s : lista){
            System.out.println(s);
        }
        
        // Removendo um elemento da lista passando o valor 
        lista.remove("Sextou");
        System.out.println("Lista: " + lista);
        
        //Removendo um elemento da lsita passando o indice
        lista.remove(1);
        System.out.println("Lista: " + lista);
        
        //Removendo todos os elementos da lista
        while (!lista.isEmpty()) {     // enquanto a lsita não está vazia
            lista.remove(0);
            System.out.println("Lista: " + lista);
        }
    
    }
}
