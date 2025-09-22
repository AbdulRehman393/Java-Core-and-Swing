/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
/**
 *
 * @author ABDUL REHMAN
 */
public class MyFrame extends JFrame implements ActionListener{
    JButton button =new JButton();
   MyFrame()
   {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       
       button= new JButton("Select a File");
       button.setFocusable(false);
       button.addActionListener(this);
       
       
       
       this.add(button);
       this.pack();
       this.setVisible(true);
       
       
   }
    
  public void actionPerformed(ActionEvent e)
  {
      JFileChooser fileChooser =new JFileChooser();
      fileChooser.setCurrentDirectory(new File("."));    //Sets Current Directory. 
      //fileChooser.setCurrentDirectory(new File("C:\\Users\\ABDUL REHMAN\\OneDrive\\Desktop"));             
      //int response= fileChooser.showOpenDialog(null);  //Select file to open.
      int response= fileChooser.showSaveDialog(null);    //Select file to save.
      
      
      
      //if(response ==0) or
      if (response==JFileChooser.APPROVE_OPTION)
      {
          File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
          System.out.println(file);
                  }
      }
      
  }
    
    
    
    

