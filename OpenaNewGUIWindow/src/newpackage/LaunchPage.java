package newpackage;
import javax.swing.*;
import java.awt.event.*;

public class LaunchPage implements ActionListener
{
    JFrame frame=new JFrame();
    JButton button= new JButton("New Window");
    
    LaunchPage()
    {
        button.setBounds(100, 150, 200, 50);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
            }
   
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button)
        {
            frame.dispose();
            NewWindow newWindow =new NewWindow();
        }
    }
     
}



