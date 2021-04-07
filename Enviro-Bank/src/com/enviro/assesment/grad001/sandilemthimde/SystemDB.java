/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pholo
 */
public class SystemDB {
    private static SystemDB database_instance = null;
    private static HashMap<String, Account> accounts = new HashMap<>();
    
    SystemDB(){
                     
    }
   
    public static SystemDB getInstance(){
        
        if(database_instance == null){
            database_instance = new SystemDB();
        }
        return database_instance;
    }
      
    public HashMap<String, Account> getConnection(){
        
        
        accounts.put("1", new SavingsAccount("101", "1",new BigDecimal(2000)));
    	accounts.put("2", new SavingsAccount("102", "2",new BigDecimal(5000)));
    	accounts.put("3", new CurrentAccount("103", "3",new BigDecimal(1000), new BigDecimal(10000)));
    	accounts.put("4", new CurrentAccount("104", "4",new BigDecimal(-5000), new BigDecimal(20000)));
        
        return accounts;
        
    }
}

