/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.bd;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author talita
 */
public class TesteBanco {
    
    public static void main(String[] args) {
        
        //Cria um objeto da classe Connection
        Connection config = new Connection();
        
        //Instancia um objeto da clase JbdcTemplate, que está 
        //usado para passar os comandos para o banco de dados
        
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());
        
        //O comando SQL deve ser passado como uma String, dentro de aspas duplas
        // Este comando foi apenas um teste
        // con.queryForList("select * from aluno;");
        
        List pokemonUsoSimples = con.queryForList("select * from Pokemon;");
        System.out.println(pokemonUsoSimples);
        
       
       List<Pokemon> pokemonUsoAvancado = con.query("select * from pokemon;",
                                           new BeanPropertyRowMapper(Pokemon.class));
        
        for (Pokemon p : pokemonUsoAvancado) {
            System.out.println(p);
        }


    }
            
    
}
