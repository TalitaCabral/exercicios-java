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
public class TesteCelular {
    public static void main(String[] args) {  

        Celular celular = new Celular();
        celular.setMarca("Iphone");
        celular.setModelo("8 Plus");
        celular.setAno(2017);
        celular.setValor(4000.0);
        System.out.println(celular.getMarca() + "\n"
                + celular.getModelo() + "\n"
                + celular.getAno() + "\n"
                + celular.getValor());

        Celular celular2 = new Celular("Sansung", "Galaxy A31", 2020, 1400.0);
        System.out.println(celular2.verCelular());

        celular2.ligar();
        celular2.desligar();
        celular2.reiniciar();
        celular2.desbloquear();
    }
}
