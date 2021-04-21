/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.poo;

/**
 *
 * @author talita
 */
public class Celular {
    
    // Atributos com especificações do celular 
    private String marca;
    private String modelo;
    private Integer ano;
    private Double valor;
    
    //construtor vazio
    public Celular(){
        
    }
    
    //construtor cheio
    public Celular(String marca, String modelo, Integer ano, Double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String valor){
        this.marca = valor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public Integer getAno() {
        return ano;
    }
    
    public void setAno(Integer ano){
        this.ano = ano;
    }
    public Double getValor(){
        return valor;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public String verCelular(){
           return "Marca: " + marca 
                + "\nModelo: " + modelo 
                + "\nAno: " + ano 
                + "\nValor: R$ " + valor;
    }
    
     public void ligar(){
        System.out.println("Ligando o celular");
    }
    public void desligar(){
        System.out.println("Desligando o celular");
    }
    public void reiniciar(){
        System.out.println("Reiniciando o celular");
    }
    public void desbloquear(){
        System.out.println("Desbloquear o celular");
    }
    
}
