/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 *
 * @author Pholo
 */
public class SavingsAccount extends Account implements AccountService{
    
    BigDecimal minimumBalance = new BigDecimal(1000);

  //convert the string to BigDecimal value
  BigDecimal input = new BigDecimal(0);  
        
  SavingsAccount(String customerNum,String accountNum, BigDecimal amount) {
    
    this.customerNum = customerNum; 
    this.accountNum = accountNum;
        
        if (amount.compareTo(BigDecimal.valueOf(1000))>=0){
          this.balance = amount; 
        } else { 
          System.out.println("wARNING: You cannot initialise an account with amount less than R1000");
          System.out.println("wARNING: Balance will be set to 0 instead");
          this.balance = input; 
        }

  }


  @Override
  public void withdraw(String accountNum, BigDecimal amountTowithdrwaw) throws WithdrawalAmountTooLargeException, AccountNotFoundException{
        
        if (amountTowithdrwaw.compareTo(BigDecimal.valueOf(1)) > 0 && amountTowithdrwaw.compareTo(balance) <= 0 && ((balance.subtract(amountTowithdrwaw)).compareTo(minimumBalance) >= 0)) {
            balance = balance.subtract(amountTowithdrwaw); 
        } else if ( amountTowithdrwaw.compareTo(balance) > 0) {
            System.out.println("wARNING: You cannot withdraw more than the current balance");
            System.out.println("wARNING: Your current balance is "+ this.getBalance());
            System.out.println("wARNING: Withdrawal is canceled");
          } else if( amountTowithdrwaw.compareTo(BigDecimal.valueOf(1)) > 0 && ((balance.subtract(amountTowithdrwaw)).compareTo(minimumBalance) < 0)){
            System.out.println("wARNING: You cannot have a balance that is less than R1000");
            System.out.println("wARNING: Your current balance is "+ this.getBalance());
            System.out.println("wARNING: Your balance after withdrawal can not be "+ (this.getBalance().subtract(amountTowithdrwaw)));
            System.out.println("wARNING: Withdraw canceled");
          } else {
            System.out.println("wARNING: Incorrect value given as withdrawn amount");
            System.out.println("wARNING: Amount requeste for withdraw "+ amountTowithdrwaw);
            System.out.println("wARNING: Withdraw canceled");
          }
        }

          
      
 
    @Override
    public void display(){

      System.out.println("\n ****** Savings Account Details ****** ");
      System.out.println(" Customer No : "+ this.getCustomerNum());
      System.out.println(" Account  No : "+ this.getAccountNum());
      System.out.println(" Current Balance : "+ this.getBalance());
      System.out.println(" ****** Savings Account Details ******\n ");
    }
}
