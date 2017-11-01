/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojektstuff;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mathi
 */
public class DrawLine extends JPanel {
 
  public void paintComponent(Graphics g) {
 
     //vertical line
     g.setColor(Color.red);
     g.drawLine(20, 20, 20, 300);
 
     //horizontal line
     g.setColor(Color.green);
     g.drawLine(20, 20, 300, 20);
 
     //diagonal line 
     g.setColor(Color.blue);
     g.drawLine(20, 20, 300, 300);
 
  }
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Draw Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(400, 400);
 
    DrawLine panel = new DrawLine();
 
    frame.add(panel);
 
    frame.setVisible(true);
}
}

