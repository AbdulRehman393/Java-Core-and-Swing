
package newpackage;
import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame= new JFrame();
    JLabel label= new JLabel("Always Be Happy!");
    
    NewWindow()
    {   
        label.setBounds(125,150,200,50);
        label.setFont(new Font("Times New Roman",Font.ITALIC,25));
        label.setForeground(Color.WHITE);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.add(label);
        frame.setVisible(true);
        

    }
    
    
    
}
