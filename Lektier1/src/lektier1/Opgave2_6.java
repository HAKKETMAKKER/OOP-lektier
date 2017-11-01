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
public class Opgave2_6 {

    /* Sum the digits in an integer. 
     Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer
     */
    public static void main(String[] args) {
        int BaseNumber = 845;
        int FirstInteger = BaseNumber % 10;
        int SecondInteger = BaseNumber / 10 % 10;
        int ThirdInteger = BaseNumber / 100;
        int IntegerSum = ThirdInteger * SecondInteger * FirstInteger;

        System.out.println("The sum of the digits in the number " + BaseNumber + " is " + IntegerSum);

    }

}
