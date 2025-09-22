/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ABDUL REHMAN
 */
public class MyFrame extends JFrame implements MouseListener
{
    JLabel label;
    ImageIcon surprised;
    ImageIcon anxious;
    ImageIcon ashamed;
    ImageIcon naughty;
    
    ImageIcon sad;
    
    MyFrame()
    {   
        surprised = new ImageIcon("surprised.png");
        anxious = new ImageIcon("anxious.png");
        ashamed = new ImageIcon("ashamed.png"); 
        naughty = new ImageIcon("naughty.png"); 
        sad = new ImageIcon("sad.png"); 
        
       
        label=new JLabel();
        label.setIcon(surprised);
        label.addMouseListener(this);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(this); // this will have your frame appear in the middle 
                                          // of your computer screen.
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        label.setIcon(anxious);
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component.
        label.setIcon(sad);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse buttton has been released on a component.
       label.setIcon(naughty);       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // Invoked when the mouse enters the area of a component.     
       label.setIcon(ashamed);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the area exits the area of a component.
       label.setIcon(surprised);
    }
    
}
