/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier6;

/**
 *
 * @author Mathi
 */
public class Student extends Person {
   
    private String status;
    public Student(String name, Address address, String status) {
        super(name, address);
        this.status = status;
    }
   @Override
    public String toString(){
        
        return "Student " + super.getName();

    }
}