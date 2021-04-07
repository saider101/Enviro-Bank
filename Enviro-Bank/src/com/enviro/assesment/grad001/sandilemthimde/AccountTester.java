/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author Pholo
 */

public class AccountTester { //begin class AccountTester
  // main method begins execution of Java application  
  public static void main(String[] args) throws WithdrawalAmountTooLargeException, AccountNotFoundException{
        
        HashMap<String, Account> accounts; //mapping savings account
        SystemDB database = SystemDB.getInstance(); //create an object using singleton instance
        database.getConnection(); //get instance
        accounts = database.getConnection(); //calling method with savings account
      
           Scanner sc = new Scanner(System.in); // declaring a scanner class
           try {
            System.out.println("Enter account number to withdraw from: ");
            String accountNum = sc.nextLine();
            Integer x = new Integer(accountNum);
           if(accountNum.equals(accounts.get(accountNum).getAccountNum())){
                
            System.out.println("Enter amount to withdraw: ");
            BigDecimal amountToWithdraw = sc.nextBigDecimal();
            
                if(x <=2){
                    SavingsAccount savings = new SavingsAccount(accounts.get(accountNum).getCustomerNum(),accounts.get(accountNum).getAccountNum(),accounts.get(accountNum).getBalance());
                    savings.withdraw(accountNum,amountToWithdraw);
                    savings.display(); 
                }
                if(x >2 &&x<=4){
                    CurrentAccount current = new CurrentAccount(accounts.get(accountNum).getCustomerNum(),accounts.get(accountNum).getAccountNum(),accounts.get(accountNum).getBalance(),accounts.get(accountNum).getOverDraft());
                    current.withdraw(accountNum,amountToWithdraw);
                    current.display();                   
                } 
                
        }
      }catch (Exception ex){
               System.out.println("wArning Account does not exist");
      }
        
    } // end method main
        
}// end class AccountTester