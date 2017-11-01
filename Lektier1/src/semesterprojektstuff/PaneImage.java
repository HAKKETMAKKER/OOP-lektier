/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojektstuff;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mathi
 */
public class PaneImage extends JFrame {
    
    public PaneImage(){
        JPanel frame = new JPanel();
        setSize(400, 400);
        getContentPane().add(frame);
    }
    
    public void addDrawing(Drawing d){
        getContentPane().add(d);
}
    
}
        
    

