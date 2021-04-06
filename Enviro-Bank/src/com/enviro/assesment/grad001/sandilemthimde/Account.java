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
public  abstract class Account { //declare an abstruct class account
    public BigDecimal balance; //declare balance to be BigDecimal
    public String customerNum; //declare customer number to be a String
    public String accountNum; // declare the customer number to be a String

    public Account() { // declare a default constructor
    }

    public Account(String customerNum, String accountNumBig,BigDecimal balance) { //declaring a constructor with arguments
        this.balance = balance; // set "this" object's balance
        this.customerNum = customerNum; // set "this" object's customerNum
        this.accountNum = accountNum; // set "this" object's accountNum
    }// end Account constructor
    
    //set account number
    public void setBalance(BigDecimal balance) { 
        this.balance = balance; // set "this" object's balance
    }//end set account number

    //set customer number
    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum; // set "this" object's customer number
    } //end set customer number

    //set account number
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum; // set "this" object's account number
    }  //end set account number

     //get balance
    public BigDecimal getBalance() {
        return balance;
    } //end method get balance

    //get customer number
    public String getCustomerNum() {
        return customerNum;
    } //end method get customer number

    //get account number
    public String getAccountNum() {
        return accountNum;
    } //end method get account number

    //abstract method display
    public abstract void display();
} //end abstract class Account
