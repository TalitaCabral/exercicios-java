/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import com.mycompany.lista06.*;

public class Empregado {
    
    Double salario;
    String nome, cargo;    
    
    public void reajustarSalario (Double porcentagemReajuste) {
        salario = salario * (porcentagemReajuste + 100) /100;  
    }
}
