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
public class Employee extends Person {
    
    private String office;
    private double salary;
    private Date dateHired;
    
    public Employee(String name, Address address, String office, double salary, Date dateHired)
    {
        super(name, address);
        this.dateHired = dateHired;
        this.office = office;
        this.salary = salary;
        
    }
    @Override
    public String toString(){
        
        return "Employee " + super.getName();
    }

    public Date getDateHired() {
        return dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public String getOffice() {
        return office;
    }
    
    
}
