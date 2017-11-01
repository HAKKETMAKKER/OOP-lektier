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
public class Student {
    public double weight,height;
    public String name,study;
    
    public Student(double w, double h, String n, String s){
        weight = w;
        height = h;
        name = n;
        study = s;
    }
    
    public String getInfo(){
      return "Name: " + name + " Study: " + study;
      
    }
    }
    
    

