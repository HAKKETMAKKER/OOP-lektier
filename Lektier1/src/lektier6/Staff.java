/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier6;

import java.util.Date;

/**
 *
 * @author Mathi
 */
public class Staff extends Employee {
    
    private String title;
    
    public Staff(String name, Address address, String office, double salary, Date dateHired, String title) {
        super(name, address, office, salary, dateHired);
    this.title = title;
    
    }
    @Override
    public String toString(){
        
        return "Staff " + super.getName();
    }
}
