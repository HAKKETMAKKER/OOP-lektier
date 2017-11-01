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
public class Person {

    private String name;
    private Address address;
    private int phonenumber;
    private String email;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString(){
        
        return "Person " + this.name;
        
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

}


