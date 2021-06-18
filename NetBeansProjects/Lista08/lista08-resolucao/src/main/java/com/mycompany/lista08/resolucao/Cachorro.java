/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista08.resolucao;

/**
 *
 * @author talita
 */
public class Cachorro {
    private String apelido;
    private String porte;
    private Integer peso;
    private String comida;
    private Integer quantidade;
    
    //construtor vazio
    public Cachorro(){};
    
    //construtor cheio
    public Cachorro(String apelido, String porte, Integer peso){
    this.apelido = apelido;
    this.porte = porte;
    this.peso = peso;
    }

    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setPorte(String porte) {
        
        this.porte = porte;
    }

    public void setPeso(Integer peso) {
        
        this.peso = peso;
    }

    public String getApelido() {
        return apelido;
    }

    public String getPorte() {
        return porte;
    }

    public Integer getPeso() {
        return peso;
    }
    public void Comer(String comida, Integer quantidade){
        this.comida = comida;
        this.quantidade = quantidade;
        
        if(peso < 0){
        System.out.println("Quantidade invalida!");
        }
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public void Verificar(){
        if(getPeso() >= 15 && "pequeno".equals(getPorte())){
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }else{
        if(getPeso() >= 30 && "medio".equals(getPorte())){
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }else{
                
        if(getPeso() >= 45 && "grande".equals(getPorte())){
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }else{
                peso += quantidade/100 * 30; 
                System.out.println(String.format("O cão comeu %d kg, de %S", getQuantidade(),getComida() ));
            }

    }
        }}

    
}

