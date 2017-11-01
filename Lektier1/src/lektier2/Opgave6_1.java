/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier2;

/**
 *
 * @author Mathi
 */
public class Opgave6_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            System.out.printf("%10s",(i % 10 != 0) ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");

        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
    
/*public static void main(String[] args) {
    
    for (int n = 1; n <= 100; n++){
        System.out.println(getPentagonalNumber);
    }
    
}
   

    public static int getPentagonalNumber(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
 
        return pentagonalNumber;
        

    }
    */


