/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.bd;

/**
 *
 * @author talita
 */
public class Pokemon {
    
    //Atributos
    private Integer id;
    private String nome;
    private String tipo;
    
    // Método toString()
    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + '}';
    }

    
}
