/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assesment.grad001.sandilemthimde;

/**
 *
 * @author cash
 */
public class AccountNotFoundException extends Exception {
 
    public AccountNotFoundException(){
        super();
    }
    public AccountNotFoundException(String message){
        super(message);
    }
    public AccountNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public AccountNotFoundException(Throwable cause){
        super(cause);
    }
}
