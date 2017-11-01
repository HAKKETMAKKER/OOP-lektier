/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier3;

/**
 *
 * @author Mathias
 */
public class Opgave9_1 {

    public static void main(String[] args){
        
        //Create a rectangle with default width and height
        SimpleRectangle rectangle1 = new SimpleRectangle();
        System.out.println("The area of the rectangle of width " 
                + rectangle1.width + " and height " + rectangle1.height + 
                " is " + rectangle1.getArea() + " and the perimeter is "
                + rectangle1.getPerimeter());
        
        //Create a rectangle with a width of 4 and height of 40
        SimpleRectangle rectangle2 = new SimpleRectangle(4,40);
        System.out.println("The area of the rectangle of width " 
                + rectangle2.width + " and height " + rectangle2.height + " is " 
                + rectangle2.getArea() + 
                " and the perimeter is " + rectangle2.getPerimeter());
        
        //Create a rectangle with a width of 3.5 and height of 35.9
        SimpleRectangle rectangle3 = new SimpleRectangle (3.5,35.9);
        System.out.println("The area of the rectangle of width " + rectangle3.width 
                + " and the heigh " + rectangle3.height + " is " + rectangle3.getArea()
                + " and the perimeter is " + rectangle3.getPerimeter());
        
    }
    
}
/*Class named Rectangle which contains two doule
data fields named width and height that specify
the width and height of the rectangle
*/
class SimpleRectangle {
    double width = 1;
    double height = 1;
    
//no-arg contstructor that creates a standard rectangle
    SimpleRectangle(){
    }
/*Constructor that creates a rectangle with specified
width and height
*/
SimpleRectangle(double newWidth, double newHeight){
    width = newWidth;
    height = newHeight;
    
}
//Create a method that gives the area of the rectangle
public double getArea(){
    return width*height;
    
}
//Create a method that gives the perimeter of the rectangle
public double getPerimeter(){
    return width+width+height+height;
            
}
}
