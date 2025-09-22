/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.util.*;
/**
 *
 * @author ABDUL REHMAN
 */
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        try{ 
        System.out.println("Enter a whole number to divide:");
        int x=scanner.nextInt();
        System.out.println("Enter a whole number to divide by:");
        int y=scanner.nextInt();
        int z=x/y;
        
        System.out.println("Result: "+z);
    }
     catch(ArithmeticException e)
     {
         System.out.println("You can't divide by zero!");
     }
       
     catch(InputMismatchException e)
     {
         System.out.println("Please enter a number!");
     }
      
     catch(Exception e)
     {
         System.out.println("Something went wrong");
     }
     finally
       {
      scanner.close();
       }
       
    }
}
