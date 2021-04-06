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
public  abstract class Account {
    public BigDecimal balance;
    public String customerNum;
    public String accountNum;

    public Account() {
    }

    public Account(String customerNum, String accountNumBig,BigDecimal balance) {
        this.balance = balance;
        this.customerNum = customerNum;
        this.accountNum = accountNum;
    }
    
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public abstract void display();
}
