/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

public class RecursosHumanos {
    
    //Atributos
    Integer totalPromovidos = 0;
    Integer totalReajustes = 0;
    
    //Métodos
    public void reajustarSalario(Colaborador colab, Double reajuste){
        // mesma coisa seria
        // colab.salario += reajuste;
        colab.salario = colab.salario + reajuste;
        totalReajustes++;
    }
    
    public void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario){
        if (novoSalario <= colab.salario){
            System.out.println("Operação invalida: novo salário deve ser maior que o atual");
        }
        else {
            colab.cargo = novoCargo;
            colab.salario = novoSalario;
            totalPromovidos++;
            System.out.println("Promoção realizada com sucesso!");
        }
    }
   
}
