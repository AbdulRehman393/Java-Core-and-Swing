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
 * 
 * @author ABDUL REHMAN
 */

public class MyFrame extends JFrame implements KeyListener {
    
    JLabel label;
    ImageIcon image= new ImageIcon("carlogo.png");
    MyFrame()
    {   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        
        this.addKeyListener(this);

        label=new JLabel();
        label.setBounds(0, 0, 160, 265);
      
        label.setIcon(image);
        
             
        this.add(label);
        this.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped= Invoked when a key is typed. Uses KeyChar, char output.
        switch(e.getKeyChar())
        {
            case 'a': label.setLocation(label.getX()-10, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
            break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
            break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed =Invoked when a physical key is pressed down. Uses KeyCode,
        //            int output.
         switch(e.getKeyCode())
        {
            case 37: label.setLocation(label.getX()-10, label.getY());
            break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
            break;
            case 39: label.setLocation(label.getX()+10, label.getY());
            break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
            break;
        }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyPressed = called whenever a button is released.
        System.out.println("You released key char: " +e.getKeyChar());
        System.out.println("You released key char: " +e.getKeyCode());

    }
}
