/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author talita
 */
public class TesteColaborador {
     public static void main(String[] args) {

        Colaborador funcionario1 = new Colaborador("Vinicius", "Estagiario", 2100.0);
        Colaborador funcionario2 = new Colaborador("Guilherme", "Gerente", 3700.0);

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(funcionario1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(funcionario2.toString());
        System.out.println("---------------------------------------------");

        rh.promoverColaborador(funcionario2, "Chefe", 5600.0);
        rh.promoverColaborador(funcionario1, "Analista", 3200.0);

        rh.reajustarSalario(funcionario1, 20.0);

        System.out.println(funcionario1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(funcionario2.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Total de reajustados:" + rh.getSalarioTotalReajustado());
        System.out.println("Total de promovidos" + rh.getTotalPromovidos());

    }
}

