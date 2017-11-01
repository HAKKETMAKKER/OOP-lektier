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
public class Faculty extends Employee {
    
    private double hours;
    private String rank;
    
    /**
     *
     * @param name
     * @param address
     * @param office
     * @param salary
     * @param dateHired
     * @param hours
     * @param rank
     */
    public Faculty(String name, Address address, String office, double salary, Date dateHired, double hours, String rank) {
        super(name, address, office, salary, dateHired);
    this.hours = hours;
    this.rank = rank;
    
    }
    @Override
    public String toString(){
        
        return "Faculty " + super.getName();
        
                }
    

    public String getRank() {
        return rank;
    }

    public double getHours() {
        return hours;
    }
    
}
