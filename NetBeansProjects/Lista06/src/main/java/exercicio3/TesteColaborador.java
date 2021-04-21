/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

public class TesteColaborador {
    
    public static void main(String[] args) {
        
        //Criação de uma instância da classe colaborador
        //Para criar um objeto da classe
        Colaborador joao = new Colaborador();
        joao.nome = "João da Silva";
        joao.cargo = "Analista Junior";
        joao.salario = 2500.0;
        
        //Criação de outro objeto da classe colaborador 
        Colaborador maria = new Colaborador();
        maria.nome = "Maria Sousa";
        maria.cargo = "Super estagiario";
        maria.salario = 1500.0;
        
        //Instanciar a classe recursosHumanos
        RecursosHumanos rh = new RecursosHumanos();
        
        //Exibir os dados dos colaboradores
        joao.exibeDados();
        maria.exibeDados();
        
        //Promover um colaborador com salario maior
        rh.promoverColaborador(joao, "Analista Pleno", 5000.0);
        
        //Promover um colaborador com salario maior
        rh.promoverColaborador(maria, "Estagiario", 1200.0);
        
        //Rejustar salario DE UM COLABORADOR
        rh.reajustarSalario(maria, 300.0);
        
         //Exibir os dados dos colaboradores
        joao.exibeDados();
        maria.exibeDados();
        
        //Exibir o total de promovidos e o total de reajustes
        System.out.println("");
        System.out.println("Total de promoções: " + rh.totalPromovidos);
        System.out.println("Total de reajustes: " + rh.totalReajustes);    
    }
}
