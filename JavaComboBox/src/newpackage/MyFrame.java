package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
     
    JComboBox comboBox;
    MyFrame()
    { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        String[] animals={"dog","cat","bird"};
        
        comboBox=new JComboBox(animals);
        comboBox.addActionListener(this);
        
       //comboBox.setEditable(true);                     //When we set eligibilty to true,We can type it.
       // System.out.println(comboBox.getItemCount());    //it will print the cutten amount of items.
       // comboBox.addItem("horse");                      //it will add item to the end of the list.
       // comboBox.insertItemAt("Lion",0);                //it will insert something(lion) at a certain index
                                                          //but at the top dog was selected.
         
         
       //comboBox.setSelectedIndex(0);                     //this will select the tem at the index 0, now the item 
                                                          // lion will be selected.
                                                          
       //comboBox.removeItem("dog");                      //this will remove the item, e.g.in my case it will remove 
                                                          // dog as I want to remove it.
       //comboBox.removeItemAt(0);                        //It will remove item at a certain index.
       //comboBox.removeAllItems();                        //It will remove all thne items.
                  
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
        
        
    }
    @Override 
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==comboBox)  
      {
          System.out.println(comboBox.getSelectedItem());  //This will return the item that we select.
         //System.out.println(comboBox.getSelectedIndex()); //This will select the index of the item.
          
      }
    }
    
    
}
