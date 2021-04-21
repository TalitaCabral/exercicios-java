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
    public class Elevador {
    private Integer peso = 0;
    private Integer totalPassageiros = 0;
    
    void entrarHomem(){
        peso += 90;
        totalPassageiros++;
    }
    
    void entrarMulher(){
        peso += 65;
        totalPassageiros++;
    }
    
    void entrarCrianca(){
        peso += 40;
        totalPassageiros++;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getTotalPassageiros() {
        return totalPassageiros;
    }   
}
