/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojektstuff;



/**
 *
 * @author Mathi
 */
public class jframetest {
    
    public static void main (String[] args){
        PaneImage p1 = new PaneImage();
        p1.addDrawing(new Drawing(10, 10, 100, 100));
        p1.addDrawing(new Drawing(100, 100, 250, 260));
        p1.setVisible(true);
   
    }
    }

