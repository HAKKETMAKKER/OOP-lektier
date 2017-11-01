/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier4;
import java.util.GregorianCalendar;
        
/* (Use the GregorianCalendar class) Java API has the GregorianCalendar class
in the java.util package, which you can use to obtain the year,
month and day of a date. The no-arg constructor constructs an instance for the
current date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH)
and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.

Write a program to perfom two tasks:
    Display the current year, month and day.
    The GregorianCalendar class has the setTimeInMillis(long), which can be used to set
    a specific elapsed time since January 1, 1970. Set the value to 
    12345678987651 and display the year, month and day.
 */

public class Opgave9_5 {
    public static void main(String[] args){
        java.util.GregorianCalendar Calendar = new GregorianCalendar();
        
        System.out.println("The current year is " + Calendar.get(Calendar.YEAR));
        System.out.println("The current month is " + Calendar.get(Calendar.MONTH));
        System.out.println("The current day is " + Calendar.get(Calendar.DAY_OF_MONTH));
   
    Calendar.setTimeInMillis(12345678987651L);
        System.out.println(" ");
        System.out.println("If the elapsed time since the 1st of January 1970 is "
                + "set to 12345678987651 milliseconds the current date would be");
        System.out.println("Year: " + Calendar.get(Calendar.YEAR) + " Month: "
                + Calendar.get(Calendar.MONTH) + " Day: " + Calendar.get(Calendar.DAY_OF_MONTH));
        
/* Apparently java starts months from 0, so the months are actually 1 lower than normal
        example: December would be 11, January would be 0
*/
    
    
            
    }
    
}
