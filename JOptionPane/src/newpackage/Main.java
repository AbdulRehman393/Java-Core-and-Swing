
package newpackage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    
     // JOptionPane = pop up a standard dialog box and prompts users for a 
     //               value and informs them of something.


    //JOptionPane.showMessageDialog(null, "This is worng information","title", JOptionPane.PLAIN_MESSAGE);
    //JOptionPane.showMessageDialog(null, "This is worng information","title", JOptionPane.INFORMATION_MESSAGE); 
    //JOptionPane.showMessageDialog(null, "Is this worng information?","title", JOptionPane.QUESTION_MESSAGE);   
    //while 
    //{
    //JOptionPane.showMessageDialog(null, "This is dangerous information","title", JOptionPane.WARNING_MESSAGE);
    
    //JOptionPane.showMessageDialog(null, "This information is showing error","title", JOptionPane.ERROR_MESSAGE);
  
   //int response= JOptionPane.showConfirmDialog(null, "Do you exercise daily?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
   //if (response == 0)  System.out.println("Great! Exercise is good for health");
   //else if (response == 1)  System.out.println("You should start doing an exercise daily.");
   //else   System.out.println("Kindy give a response.");
   
   //String name= JOptionPane.showInputDialog("What is your name?");
   //System.out.println("Hello " +name); 
    
    String [] responses = {"Yes, I am elder than 18", "I am under 18","I dont want to tell"};  
    ImageIcon icon= new ImageIcon("image.png");
    JOptionPane.showOptionDialog(null, "Are you 18 years old or older??", "Eligibility Checking", 
                                 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
        
    
    
    
    
    }
    }

