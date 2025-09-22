/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ABDUL REHMAN
 */
public class Main {
    public static void main(String[] args) {
        
        Integer [] intArray={1,2,3,4,5};
        Double [] doubleArray={2.4,4.5,1.9,5.3};
        Character [] charArray={'h','e','l','l','o'};
        String[] stringArray={"B","Y","E"};
    
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
        
        
        public static<T> void displayArray(T[] array)
        {
            for( T x: array)
            {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    
        public static<T> T getFirst(T[] array)
        {
            return array[0];
        }
        
        
}
    
    
        
        
        
    
    

