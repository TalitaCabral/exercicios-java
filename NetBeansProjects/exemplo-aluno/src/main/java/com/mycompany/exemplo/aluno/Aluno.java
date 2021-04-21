/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.aluno;

/**
 *
 * @author joaov
 */
public class Aluno {
    
    //Atributos
    private Integer ra;
    private String nome;
    private Integer quantFaltas;
    private Double nota1, nota2;
    
    // Construtor
    
    // Construtor vazio
    public Aluno() {
        
    }
    
    /* Construtor que recebe como argumentos o ra e o nome do aluno
       Zera os atributos nota1, nota2 e quantFaltas
    */
    
     public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        nota1 = 0.0;
        nota2 = 0.0;
        quantFaltas = 0;
    }
    
     // Construtor cheio - recebe todos os valores de todos os atributos
    public Aluno(Integer ra, String nome, Integer quantFaltas, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.quantFaltas = quantFaltas;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    //Metodos

    
    //sobrescrita do metodo tostring()
    @Override
    public String toString() {
        return String.format("RA: %s, Nome: %s, Faltas: %d, Nota 1: %.2f, Nota 2: %.2f",
        ra, nome, quantFaltas, nota1, nota2);
    }
    
    
    //Visualizar nota
    public void verNotas(){
        System.out.println("Notas do aluno" + nome + ", ra " + ra);
        System.out.println("Nota1:" + nota2 );
        System.out.println("Nota2:" + nota2 );
    }
    
    //Visualizar faltas
    public void verFaltas(){
        System.out.println("Faltas do aluno" + nome + ", RA" + ra );
        System.out.println("Quantidade de faltas: " + quantFaltas);
    }
    
    //Calcula a media 
    public Double calculaMedia() {
        return nota1 * 0.4 + nota2 * 0.6;
    }
    
    //Exibir status do aluno
      public void exibeStatus() {
        System.out.print("Status do aluno " + nome + ", RA " + ra + ":");
        if (calculaMedia() >= 6.0) {
             System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    } 
      
    // Getters e Setters

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantFaltas() {
        return quantFaltas;
    }

    public void setQuantFaltas(Integer quantFaltas) {
        this.quantFaltas = quantFaltas;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        if (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("Valor de nota1 inválido");
            this.nota1 = 0.0;
        }
        else {
            this.nota1 = nota1;
        }
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        if (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Valor de nota2 inválido");
            this.nota2 = 0.0;
        }
        else {
            this.nota2 = nota2;
        }
    }   
}
  
