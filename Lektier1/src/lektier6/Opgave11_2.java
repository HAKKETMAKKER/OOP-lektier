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
public class Opgave11_2 {
    public static void main(String[] args){
        Employee employee1 = new Employee("Jan" , new Address("Humlevej", 17, 5270, "Denmark"), "Microsoft", 450.5, new Date(2017, 5, 5));
        System.out.println(employee1);
    }
 
}
