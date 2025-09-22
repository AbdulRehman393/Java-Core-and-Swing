/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;
import java.util.Scanner; 
/**
 *
 * @author ABDUL REHMAN
 */
public class main {
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Press 1 for \"Dog\" amd 2 for \"Cat\"");
        int choice =scanner.nextInt();
        if (choice ==1)
        {
            animal=new Dog();
            animal.speak();
        }
        else if (choice ==2)
        {
            animal=new Cat();
            animal.speak();
        }
        else
                {
            animal=new Animal();
            animal.speak();
                }
        
    }
}
