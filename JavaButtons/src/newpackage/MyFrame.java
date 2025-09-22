/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
/**
 *
 * @author ABDUL REHMAN
 */
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    
    MyFrame()
    {
        ImageIcon icon=new ImageIcon("button.png");
        ImageIcon icon2=new ImageIcon("download.jfif");
        
        label=new JLabel();
        label.setIcon(icon2);
        label.setBounds(100, 250, 250, 100);
        label.setVisible(false);
       
        
       button =new JButton();
       button.setBounds(100, 100, 250, 100);
       button.addActionListener(this);
       //button.addActionListener(e -> System.out.println("Hi"));
       button.setText("Button");
       button.setFocusable(false);
       button.setIcon(icon);
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setVerticalTextPosition(JButton.BOTTOM);
       button.setFont(new Font("Times New Roman",Font.BOLD,25));
       button.setIconTextGap(0);
       button.setForeground(Color.darkGray);
       button.setBackground(Color.lightGray);
       button.setOpaque(true);
       button.setBorder(BorderFactory.createEtchedBorder());
       
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button)
        {
            //System.out.println("Hi");
            //button.setEnabled(false);
            
            label.setVisible(true);
            
        
        
        }
    }
    
    
    
}
