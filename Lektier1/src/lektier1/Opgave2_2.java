/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Mathi
 */
public class Opgave2_2 {

    /* Write a program that reads in the lenght of sides of an equilateral
    triangle and computes the area and volume using the formulas
     */
    public static void main(String[] args) {
        double lenghtOfSides = (3.5);

        double area = (sqrt(3) / 4) * (lenghtOfSides * lenghtOfSides);
        double volume = area * lenghtOfSides;

        System.out.println("The area is " + area + " and the volume of the Triangular prism is " + volume);

    }
}
