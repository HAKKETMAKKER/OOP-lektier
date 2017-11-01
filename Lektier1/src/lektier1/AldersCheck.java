/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier1;

/**
 *
 * @author Mathi
 */
public class AldersCheck {

    public static void main(String[] args) {
        int Age = 19;
        
        if (Age < 18) {
            System.out.println("Din alder, " + Age + ", er under 21 - og også under 18.");
        } else if (Age >= 18 && Age < 21) {
            System.out.println("Din alder, " + Age + ", er under 21, men over 18!");
        } else {
            System.out.println("Din alder, " + Age + ", er over 21!");
        }
        int AgePlusOne = Age++;
        
        if (AgePlusOne <= 19) {
            System.out.println("Efter næste fødselsdag er du stadig under 21!");
        } else if (AgePlusOne > 20 && AgePlusOne < 22){
            System.out.println("Efter næste fødselsdag er du endeligt over 21!");
        }
        int AgeDividedByTwo = Age%2;
        
        if (AgeDividedByTwo > 0 )   {
            System.out.println("Din alder er dividerbar med 2. Lucky you!");
        }
            
            
                

    }
}
