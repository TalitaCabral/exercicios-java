/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaov
 */
public class TesteAluno {
    public static void main(String[] args) {
        
    //Criação de um objeto de classe Aluno    
    Aluno joao = new Aluno();
    
     // Atribuição de valores aos atributos do objeto joao
        joao.setRa(1202021);
        joao.setNome("João Amorim");
        joao.setNota1(20.0);
        joao.setNota2(8.0);
        joao.setQuantFaltas(0);
    
    // Chamada dos metodos do objeto joao
    joao.verNotas();
    joao.verFaltas();
    
    //Criação de um 2 objeto da classe Aluno
    Aluno talita = new Aluno();
    
   // Atribuição de valores para os atributos do objeto larissa
        talita.setRa(1202024);
        talita.setNome("Talita Cabral");
        talita.setNota1(4.0);
        talita.setNota2(4.5);
        talita.setQuantFaltas(3);
    
    // Chamada dos metodos do objeto joao
    talita.verNotas();
    talita.verFaltas();
    
    System.out.println("O aluno" + joao.getNome() + "tem RA" + joao.getRa() +
                    "tem média " + joao.calculaMedia());
    
    System.out.println("O aluno" + talita.getNome() + "tem RA" + talita.getRa() +
                     "tem media " + talita.calculaMedia());
    
    joao.exibeStatus();
    talita.exibeStatus();
    
    // Criação de outro aluno usando o construtor que recebe o ra e o nome
        Aluno rafael = new Aluno(1201081, "Rafael Rocha");
        rafael.setNota1(7.0);
        rafael.setNota2(6.0);
        rafael.setQuantFaltas(3);
        rafael.exibeStatus();
        
        //Exibe os objetos
        //System.out.println("-",repeat(15));
        
        System.out.println(joao);
        System.out.println(talita);
        System.out.println(rafael);
       
        //todas as classes em Java são herdeiras de uma classe chamada object
        
        // Criando uma lista de aluno
        List<Aluno> lista = new ArrayList();
        
        lista.add(joao);
        lista.add(talita);
        lista.add(rafael);
        
        // Exibindo a lista de alunos
        System.out.println("\nExibindo a lista de alunos:");
        for (Aluno a : lista ) {
            System.out.println(a);
        }
        
        // Limpando a lista
        lista.clear();
        System.out.println("Lista: " + lista);
        
    }
    
}
