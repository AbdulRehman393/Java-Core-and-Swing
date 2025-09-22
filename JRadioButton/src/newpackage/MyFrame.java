/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ABDUL REHMAN
 */
public class MyFrame extends JFrame implements ActionListener{
        JRadioButton pizzaButton;  
         JRadioButton burgerButton;    
         JRadioButton pastaButton;   
         ImageIcon pizzaIcon;
         ImageIcon burgerIcon;
         ImageIcon pastaIcon;   
    MyFrame()       
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        pizzaIcon =new ImageIcon("logo1.png");
        burgerIcon =new ImageIcon("logo2.png");
        pastaIcon =new ImageIcon("logo3.png");
        
        pizzaButton =new JRadioButton("Pizza");
        burgerButton =new JRadioButton("Burger");
        pastaButton =new JRadioButton("Pasta");
        
        ButtonGroup  group =new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(pastaButton);
        
        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        pastaButton.addActionListener(this);
        
        
        pizzaButton.setIcon(pizzaIcon);
        burgerButton.setIcon(burgerIcon);
        pastaButton.setIcon(pastaIcon);
        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(pastaButton);
        this.pack();
        this.setVisible(true);
    }
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==pizzaButton)
        {System.out.println("You ordered Pizza!");
    }
       else if(e.getSource()==burgerButton)
        {System.out.println("You ordered Burger!");
    }
    else
       {
           System.out.println("You ordered Pasta!"); 
    }
    }
}
