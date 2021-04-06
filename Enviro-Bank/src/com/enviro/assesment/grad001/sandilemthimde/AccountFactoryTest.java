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

public class AccountFactoryTest { //begin class AccountFactoryTest
  // main method begins execution of Java application  
  public static void main(String[] args) throws WithdrawalAmountTooLargeException, AccountNotFoundException{
        
        HashMap<String, SavingsAccount> savingsAccounts; //mapping savings account
        SystemDB database1 = SystemDB.getInstance(); //create an object using singleton instance
        database1.getConnection(); //get instance
        savingsAccounts = database1.getSavingsAccountHashMap(); //calling method with savings account
        
        HashMap<String, CurrentAccount> currentAccounts; //mapping current account
        SystemDB database2 = SystemDB.getInstance(); //create an object using singleton instance
        database2.getConnection(); //calling method with current accounts
        currentAccounts = database2.getCurrentAccountHashMap();
        


        Scanner sc = new Scanner(System.in); // declaring a scanner class
 
        
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
                
                if(choice ==1){//if choice equals one
                    if(accountNum.equals(savingsAccounts.get(accountNum).getAccountNum())){
                           //check in savings class
                            SavingsAccount mySavings = new SavingsAccount(savingsAccounts.get(accountNum).getCustomerNum(),savingsAccounts.get(accountNum).getAccountNum(),savingsAccounts.get(accountNum).getBalance());
                             mySavings.withdraw(accountNum,amountToWithdraw);
                             mySavings.display();                   
                             

                    }
                } else if(choice == 2){ //if choice equals 2
                    if(accountNum.equals(currentAccounts.get(accountNum).getAccountNum())){
                        //check current account
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
    } // end method main
        
}// end class AccountFactoryTest