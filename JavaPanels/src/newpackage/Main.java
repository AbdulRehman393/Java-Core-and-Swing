/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author ABDUL REHMAN
 */
public class Main {
    public static void main(String[] args) {
        
        ImageIcon icon=new ImageIcon("image.jfif");
        
        JLabel label=new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 250, 250);
        
        
        
        
        
        
        
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250,250);
        redPanel.setLayout(new BorderLayout());
        
        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250,250);
        bluePanel.setLayout(new BorderLayout());
        
        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame frame=new JFrame();
        frame.setTitle("GUI Panels");   
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);
    }
    
}
