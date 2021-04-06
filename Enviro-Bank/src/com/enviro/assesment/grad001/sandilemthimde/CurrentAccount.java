/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

import java.math.BigDecimal;

/**
 *
 * @author Pholo
 */
public class CurrentAccount extends Account implements AccountService{
    private BigDecimal overDraftLimit;

    public CurrentAccount() {
        super();
    }
  
    CurrentAccount(String customerNum, String accountNum,BigDecimal amount,BigDecimal overDraft){

      super(customerNum,accountNum,amount);
      this.customerNum = customerNum;
      this.accountNum = accountNum;
      this.balance = amount;
      this.overDraftLimit = overDraft; 
      
      //convert integer value to BigDecimal value
      BigDecimal input = new BigDecimal(0);
      
      if(overDraftLimit.compareTo(BigDecimal.valueOf(100000))<=0){
              this.overDraftLimit =overDraft;
      } 
      else if(overDraftLimit.compareTo(BigDecimal.valueOf(100000))>=0){
         System.out.println(" wARNING: You cannot initialise the overdraft by an amount greater than the limit of R100 000");
         this.overDraftLimit =input;
      } 

    }
    public BigDecimal getOverDraft(){
        return overDraftLimit;
    }
    public BigDecimal getOverDraftFacility(){
        return balance.add(getOverDraft());
    }

    @Override
    public void withdraw(String accountNum, BigDecimal amountTowithdrwaw){
        
        if (amountTowithdrwaw.compareTo(BigDecimal.valueOf(1)) > 0 && amountTowithdrwaw.compareTo(getOverDraftFacility()) <= 0) {
          balance = balance.subtract(amountTowithdrwaw); 
        } else if ( amountTowithdrwaw.compareTo(balance) > 0){
          System.out.println(" wARNING: You cannot withdraw more than the current balance");
          System.out.println(" wARNING: Your current balance is "+ this.getBalance());
          System.out.println(" wARNING: Your current overdraft is "+ this.getOverDraft());
        } else {
          System.out.println(" wARNING: Incorrect value given as withdrawn amount");
          System.out.println(" wARNING: Amount requeste for withdraw "+ amountTowithdrwaw);
          System.out.println(" wARNING: Withdraw canceled");
        }
    }

    @Override
    public void display(){

      System.out.println("\n ****** Curren Account Details ****** ");
      System.out.println(" Customer No : "+ this.getCustomerNum());
      System.out.println(" Account  No : "+ this.getAccountNum());
      System.out.println(" Current Balance : "+ this.getBalance());
      System.out.println(" ****** Current Account Details ******\n ");
    }
}