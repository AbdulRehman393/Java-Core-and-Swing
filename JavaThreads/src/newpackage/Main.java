/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ABDUL REHMAN
 */
public class Main {
    public static void main(String[] args) //throws InterruptedException
    {
        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("Mainnnnnn");
        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
       // System.out.println(Thread.currentThread().isAlive());    
        
        
     /*   for (int i=3;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!"); */
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("You are done!");
    }
        
        
    }
    

