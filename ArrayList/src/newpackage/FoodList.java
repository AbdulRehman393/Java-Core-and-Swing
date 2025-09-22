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
public class FoodList {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * 
 *
 * @author ABDUL REHMAN
 */
 
    public static void main(String[] args) {
     /**
     * @param args the command line arguments
     */
 ArrayList<String> food=new ArrayList();
 food.add("Pizza");
 food.add("Hamburger");
 food.add("Hotdog");
food.set(0,"Sandwich");
//food.remove(2);
//food.clear();
for(int i=0;i<food.size();i++)
{
    System.out.println(food.get(i));
}    
    
    
}


}
