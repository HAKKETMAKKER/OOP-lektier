/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier3;

/**
 *
 * @author Mathi
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Vi kører!");
        
        Student student1 = new Student(75.0, 178.0, "Erik Smith", "Robot Diplom");
        
        System.out.println(student1.getInfo());
        
        
        
    }
}
