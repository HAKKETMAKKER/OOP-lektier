/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier4;

/*  Opgave 9_6
    (Stopwatch) Design a class named StopWatch. The class contains:
        1. Private data fields startTime and endTime with getter methods.
        2. A no-arg constructor that initializes startTime with the current time.
        3. A method named start() that resets the startTime to the current time.
        4. A method named stop() that sets the endTime to the current time.
        5. A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 */


public class StopWatch {
    
    private long startTime;
    private long endTime;
    
    StopWatch(){
        startTime = System.currentTimeMillis();
           }
    
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    public long getStartTime(){
        return startTime;
    }
    
    public long getEndTime(){
        return endTime;
        
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}