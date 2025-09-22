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
public class main {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
        
        
        
        ArrayList <String> bakeryList=new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
       ArrayList <String> produceList=new ArrayList<String>();
       produceList.add("tomatoes");
       produceList.add("zucchini");
       produceList.add("peppers");
       
       
       ArrayList <String> drinksList=new ArrayList<String>();
       drinksList.add("soda");
       drinksList.add("coffee");
       
       groceryList.add(bakeryList);
       groceryList.add(produceList);
       groceryList.add(drinksList);
       
       
       
       
        System.out.println(groceryList.get(0).get(0));
       
       
    }
}
