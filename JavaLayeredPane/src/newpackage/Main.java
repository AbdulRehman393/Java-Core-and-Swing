package newpackage;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        
        //JLayered Pane= Swing Container that provides a third dimension
        //               for positioning components.
        //               eg.   depth,Z-index
        
        
        JLabel label1= new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200,200);
        
        JLabel label2= new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200,200);
        
        JLabel label3= new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150, 150, 200,200);
        
        
        JLayeredPane layeredPane= new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.setBackground(Color.BLACK);
        layeredPane.setOpaque(true);
        //layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
        //layeredPane.add(label2,JLayeredPane.PALETTE_LAYER);
        //ayeredPane.add(label3,JLayeredPane.DRAG_LAYER);
        
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(2));
        layeredPane.add(label3,Integer.valueOf(1));
        
        JFrame frame= new JFrame("JLayered Pane");
        frame.add(layeredPane);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
                
        
        
        
        
    }
}
