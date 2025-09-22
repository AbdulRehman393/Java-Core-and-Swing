package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Select a color");
        button.setFocusable(false);
        button.addActionListener(this);
        
        label= new JLabel("I am a Computer Science Student.");
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("Georgia",Font.ITALIC,30));
       
        this.add(button);
        this.add(label);
        
        this.pack();
        this.setVisible(true);
        
    }
    
    @Override 
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==button)
        {
            JColorChooser colorChooser= new JColorChooser();
            Color color= JColorChooser.showDialog(null, "Choose a Color", Color.black);
           
           //label.setBackground(color);
            label.setForeground(color);
           
        
        }
        
    }
    
    
}
