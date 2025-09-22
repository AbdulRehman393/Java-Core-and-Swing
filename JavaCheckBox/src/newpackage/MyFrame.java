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
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon checkIcon;
    ImageIcon xIcon;
    MyFrame()
    { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setLayout(new FlowLayout());
        
          
        checkIcon= new ImageIcon("logo1.png");
        xIcon= new ImageIcon("logo2.png");
        
      
        button=new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);
        
        
        checkBox= new JCheckBox();
        checkBox.setText("Are you a Student?");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);
        
      
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
        
      
    }
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {      
      System.out.println(checkBox.isSelected());  //this will determine CheckBox is selected or not and will give
                                                        //true or false.
        
                }
    }
    
    
    
}
