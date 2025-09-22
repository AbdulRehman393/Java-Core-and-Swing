package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    
    ImageIcon saveIcon;
    ImageIcon loadIcon;
    ImageIcon exitIcon;
    
    MyFrame()
    { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        
        saveIcon= new ImageIcon("savelogo.png");
        loadIcon= new ImageIcon("loadlogo.png");
        exitIcon= new ImageIcon("exitlogo.png");
        
        
         menuBar= new JMenuBar();
     
         fileMenu = new JMenu("File ");
         editMenu = new JMenu("Edit");
         helpMenu = new JMenu("help");
        
         loadItem = new JMenuItem("Load");
        saveItem= new JMenuItem("Save");
        exitItem=new JMenuItem("Exit");
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
     
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);
        
        
        fileMenu.setMnemonic(KeyEvent.VK_F);   //Alt +F for Load
        editMenu.setMnemonic(KeyEvent.VK_E);   //Alt +E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H);   //Alt +F for Help
        loadItem.setMnemonic(KeyEvent.VK_L);   //L for Load
        saveItem.setMnemonic(KeyEvent.VK_S);   //S for Save
        exitItem.setMnemonic(KeyEvent.VK_E);   //E for Exit
                
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent e)
    {
      if(e.getSource()==loadItem)
      {
          System.out.println("You loaded your file.");
      }
       else if(e.getSource()==saveItem)
      {
          System.out.println("You saved your file.");
      }
         else if(e.getSource()==exitItem)
      {
          System.exit(0);    //this will close out of your program.
      }
      
   
    }
    
    
}
