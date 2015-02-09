/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author syst3m
 */

import java.util.ArrayList;
import java.util.List;
import model.Account;
public class Bank {
    
    List<Account> accountList = new ArrayList<Account>();  
    
    public Bank(){
        Account ac1 = new Account();
        Account ac2 = new Account();
        Account ac3 = new Account();

        ac1.setPersonName("saman");
        ac1.setCreditCard("123456");
        accountList.add(ac1);
        
        ac2.setPersonName("alex");
        ac2.setCreditCard("1234567");
        accountList.add(ac2);
        
        ac3.setPersonName("Jax");
        ac3.setCreditCard("123456");
        accountList.add(ac3);       
    }
    
    public boolean pay(String creditCard, String personName,double amount){
        for(int  i = 0; i< accountList.size(); ++i){
            if(accountList.get(i).getPersonName().equals(personName) && accountList.get(i).getCreditCard().equals(creditCard)){
                return true;
            }           
        }
        return false;
    }
    
}
