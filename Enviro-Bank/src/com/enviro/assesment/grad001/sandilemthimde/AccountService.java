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
public interface AccountService {
    public void withdraw(String accountNum, BigDecimal amountTowithdrwaw) throws WithdrawalAmountTooLargeException, AccountNotFoundException;
}
