/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author ABDUL REHMAN
 */
public class Main {
    public static void main(String[] args) {
     
        try{ FileReader reader=new FileReader("art.txt");
            int data=reader.read();
            while(data!=-1)
            {
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();
        
        
    }
     catch(FileNotFoundException e)
     {
         e.printStackTrace();
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
       
       
       
       
       
    }
}
