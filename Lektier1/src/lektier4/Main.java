/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier4;

/**
 *
 * @author Mathi
 */
public class Main {
    public static void main(String[] args){
        StopWatch stopwatch1 = new StopWatch();
        
        stopwatch1.start();
        //System.out.println("The stopwatch started at: " + stopwatch1.getStartTime());
        
        
        for (int i=1; i < 50000000; i++)
            
        
        stopwatch1.stop();
        //System.out.println("The stopwatch stopped at: " + stopwatch1.getEndTime());
        
        System.out.println("The execution time of the for loop that "
                + "counts all the way to 50000000 is:  " +
                stopwatch1.getElapsedTime() + " milliseconds");
        
        
    }
}
