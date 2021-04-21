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
public class TesteCachorro {
     public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Cachorro cachorro3 = new Cachorro();
        
        cachorro1.setApelido("Max");
        cachorro1.setPorte("pequeno");
        cachorro1.setPeso(10);
        cachorro1.setComida("Pedigree");
        cachorro1.setQuantidade(5);
        System.out.println("Apelido: "+cachorro1.getApelido() + "\n" 
                         + "Porte: "+cachorro1.getPorte() + "\n" 
                         + "Peso:"+cachorro1.getPeso()+ " kg");
        
        cachorro1.Verificar();
        
        System.out.println("---------------------------------");
        System.out.println(cachorro1.getApelido() + " " + cachorro1.getPeso()+" kg");
        
        cachorro2.setApelido("Juca");
        cachorro2.setPorte("medio");
        cachorro2.setPeso(35);
        cachorro2.setComida("Nutra Dog");
        cachorro2.setQuantidade(10);
        System.out.println("Apelido: "+cachorro2.getApelido() + "\n" 
                         + "Porte: "+cachorro2.getPorte() + "\n" 
                         + "Peso:"+cachorro2.getPeso()+ " kg");
        
        cachorro2.Verificar();
        
        System.out.println("---------------------------------");
        System.out.println(cachorro1.getApelido() + " " + cachorro1.getPeso()+" kg");
        
        
        cachorro3.setApelido("Labrador");
        cachorro3.setPorte("grande");
        cachorro3.setPeso(50);
        cachorro3.setComida("Dog delicia");
        cachorro3.setQuantidade(0);
        System.out.println("Apelido: "+cachorro3.getApelido() + "\n" 
                         + "Porte: "+cachorro3.getPorte() + "\n" 
                         + "Peso:"+cachorro3.getPeso()+ " kg");
        
        cachorro3.Verificar();
        
        System.out.println("---------------------------------");
        System.out.println(cachorro1.getApelido() + " " + cachorro1.getPeso()+" kg");
        System.out.println(cachorro2.getApelido() + " " + cachorro2.getPeso()+" kg");
        System.out.println(cachorro3.getApelido() + " " + cachorro3.getPeso()+" kg");
        
        
    }
}

