/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ABDUL REHMAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try  {
         FileWriter writer=new FileWriter("2321");
         writer.write("Roses are Red \nViolets are Blue \nSunflowers are Yellow");
         writer.append("\n(A poetry by John)");
         writer.close();
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
        
    }
    
}
