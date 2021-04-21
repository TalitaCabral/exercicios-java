/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.bd;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author talita
 */
public class Connection {
    
    private BasicDataSource dataSource;
    
    // Construtor
    public Connection() {
        dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("org.h2.Driver");
        dataSource​.setUrl("jdbc:h2:file:./meu_banco");  
        dataSource​.setUsername("sa");
        dataSource​.setPassword("");      
    }
    
    // Getter do dataSource
    public BasicDataSource getDataSource() {
        return dataSource;
    }
    
    
    
    
}
