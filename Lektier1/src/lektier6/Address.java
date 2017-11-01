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
public class Address {
    private String street;
    private int streetNumber;
    private int zipCode;
    private String country;
    
    public Address(String street, int streetNumber, int zipCode, String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.country = country;  
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
    
}
