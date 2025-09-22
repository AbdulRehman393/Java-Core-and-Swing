 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author ABDUL REHMAN
 */
public class ProgressBarDemo {
      JFrame frame= new JFrame();
      JProgressBar bar= new JProgressBar();
    
    ProgressBarDemo()
    {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);        //it adds percentage to your progress bar.
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setBackground(Color.black);
        bar.setForeground(Color.red);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.add(bar);
        frame.setVisible(true);
        
        fill(); 
        
    }
    
    public void fill()
    {   int counter=0;
        while(counter<=100)
    {   
        bar.setValue(counter);
        
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
           e.printStackTrace();
                   
        }
        counter +=1;
    }
        bar.setString("Done!");
        
        
    }
     
    
    
}
