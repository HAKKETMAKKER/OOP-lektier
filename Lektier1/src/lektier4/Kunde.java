/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier4;
import java.util.UUID;

/**
 A class that has a no arg constructor that creates a balance with 0,
 * thereafter you can increase the balance by using .increaseBalance and
 * decrease it by using .decreaseBalance
 */
public class Kunde {
    private double balance;
    private UUID id;
    private String name;
    
    Kunde(){
        UUID id = UUID.randomUUID();
        balance = 0;
    }
    
    public void increaseBalance(double balanceIncreasement){
        balance = balance + balanceIncreasement;
    }
    
    public boolean decreaseBalance(double balanceDecreasement){
        if (balance>=balanceDecreasement)
        balance = balance - balanceDecreasement;
            return true;}
  
    
            
    }


