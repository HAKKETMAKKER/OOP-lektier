/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsningLektier4;

import java.util.UUID;

/**
 *
 * @author ancla
 */
public class Customer {

    private String name;
    private UUID id;
    private double balance;

    public Customer(String nName) {
        name = nName;
        id = UUID.randomUUID();
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void deductBalance(double amount) {
        if (balance > amount) {
            balance -= amount;
        }
        else
        {
            balance = 0;
        }
    }

    public UUID getId()
    {
        return id;
    }

    public String getInfo() {
        return "Name: " + name + " Balance: " + balance;
    }
}
