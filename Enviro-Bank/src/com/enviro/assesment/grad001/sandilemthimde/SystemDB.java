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
    private static HashMap<String, SavingsAccount> mapSavingsAccounts = new HashMap<>();
    private static HashMap<String, CurrentAccount> mapCurrentAccounts = new HashMap<>();
    
    SystemDB(){
                     
    }
   
    public static SystemDB getInstance(){
        
        if(database_instance == null){
            database_instance = new SystemDB();
        }
        return database_instance;
    }
      
    public void getConnection(){
        
        
        SavingsAccount s1 = new SavingsAccount("101", "1",new BigDecimal(2000));
    	SavingsAccount s2 = new SavingsAccount("102", "2",new BigDecimal(5000));
    	CurrentAccount c1 = new CurrentAccount("103", "3",new BigDecimal(1000), new BigDecimal(10000));
    	CurrentAccount c2 = new CurrentAccount("104", "4",new BigDecimal(-5000), new BigDecimal(20000));

        
        
        mapSavingsAccounts.put(s1.getAccountNum(), s1);
        mapSavingsAccounts.put(s2.getAccountNum(), s2);
        mapCurrentAccounts.put(c1.getAccountNum(), c1);
        mapCurrentAccounts.put(c2.getAccountNum(), c2);
        
    }
    
    public static HashMap<String, SavingsAccount> getSavingsAccountHashMap(){
        return mapSavingsAccounts;
    }
    
    public static HashMap<String, CurrentAccount> getCurrentAccountHashMap(){
        return mapCurrentAccounts;
    }

}

