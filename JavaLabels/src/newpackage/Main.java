/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Main
{
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("logo.jfif");
        Border border=BorderFactory.createLineBorder(Color.black,4);
        
        
        JLabel label=new JLabel();
        label.setText("Khabib,an undisputed Champion.");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,0));
        label.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20) );
        label.setIconTextGap(10);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
       //label.setBounds(100,100,250,250);
        
        
        JFrame frame=new JFrame();
        frame.setTitle("GUI JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        //frame.getContentPane().setBackground(new Color(0,0,0));
        frame.add(label);
        frame.pack();
    }
}