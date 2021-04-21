/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import com.mycompany.lista06.*;

public class TesteEmpregado {
   
    public static void main(String[] args) {
        Empregado joao = new Empregado();
        Empregado talita = new Empregado();
        
        joao.nome = "Joao";
        joao.cargo = "Analista de Sistemas";
        joao.salario = 5400.00;
        
        System.out.println("nome:" + joao.nome);
        
        System.out.println("cargo:" + joao.cargo);
        
        joao.reajustarSalario(15.0);
        
        System.out.println("salario:" + joao.salario);
        
        talita.nome = "Talita";
        talita.cargo = "Sustentação";
        talita.salario = 2600.00;
        
        System.out.println("nome:" + talita.nome);
        
        System.out.println("cargo:" + talita.cargo);
        
        talita.reajustarSalario(15.0);
        
        System.out.println("salario:" + talita.salario);
          
    }
}
