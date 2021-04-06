/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

import java.math.BigDecimal;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Token;

/**
 *
 * @author Pholo
 */

public class AccountFactoryTest {
  public static void main(String[] args) throws WithdrawalAmountTooLargeException, AccountNotFoundException{
        
        HashMap<String, SavingsAccount> savingsAccounts;
        SystemDB database1 = SystemDB.getInstance();
        database1.getConnection();
        savingsAccounts = database1.getSavingsAccountHashMap();
        
        HashMap<String, CurrentAccount> currentAccounts;
        SystemDB database2 = SystemDB.getInstance();
        database2.getConnection();
        currentAccounts = database2.getCurrentAccountHashMap();
        


        Scanner sc = new Scanner(System.in);
 
        
         try {
            
            System.out.println("Enter account number to withdraw from: ");
            String accountNum = sc.nextLine();
            System.out.println("Enter amount to withdraw: ");
            BigDecimal amountToWithdraw = sc.nextBigDecimal();
            System.out.println("Saving Account choose 1");
            System.out.println("Current Account choose 2");
            System.out.println("Enter Account Type");
            int choice = sc.nextInt();

            for(int i = 0; i <1; i++) {
                
                if(choice ==1){
                    if(accountNum.equals(savingsAccounts.get(accountNum).getAccountNum())){

                            SavingsAccount mySavings = new SavingsAccount(savingsAccounts.get(accountNum).getCustomerNum(),savingsAccounts.get(accountNum).getAccountNum(),savingsAccounts.get(accountNum).getBalance());
                             mySavings.withdraw(accountNum,amountToWithdraw);
                             mySavings.display();                   
                             

                    }
                } else if(choice == 2){
                    if(accountNum.equals(currentAccounts.get(accountNum).getAccountNum())){

                             CurrentAccount myCurrent = new CurrentAccount(currentAccounts.get(accountNum).getCustomerNum(),currentAccounts.get(accountNum).getAccountNum(),currentAccounts.get(accountNum).getBalance(),currentAccounts.get(accountNum).getOverDraft());
                             myCurrent.withdraw(accountNum,amountToWithdraw);
                             myCurrent.display();    

                    }                   
                }

           }
        }
        catch (Exception e){
            System.out.println("Account does not exist: " + e.getMessage());
        }
    }
        
}