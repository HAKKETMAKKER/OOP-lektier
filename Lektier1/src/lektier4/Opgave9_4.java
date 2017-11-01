/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier4;

/*(Use the Random class) Write a program that creates
a Random object with seed 1000 and displays the first
100 random integers between 1 and 49 using the
nextInt(49) method.
 */
public class Opgave9_4 {
    public static void main(String[] args){
        //Create a Random object with seed 1000
        java.util.Random randomNumber = new java.util.Random(1000);
        
        /* Displays the first 100 random integers 
        between 1 and 49 using the nextInt(49) method
        */
        for (int i = 1; i <101; i++) {
              
        System.out.println(randomNumber.nextInt(49));
                        
        }
                
        }
}
