package newpackage;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner=new Scanner(System.in);
        File file=new File("Headlands - National Sweetheart.wav");
       AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
       Clip clip=AudioSystem.getClip();
       clip.open(audioStream); 
       clip.start();
      String response="";
      
      while(!response.equals("Q"))
      {
          System.out.println("P=play, S=Stop, R=Reset, Q=Quit");
          System.out.println("Enter your choice");

          response=scanner.next();
          response=response.toUpperCase();
          switch(response)
          {
              case "P": clip.start();
              break;
              case "S": clip.stop();
              break;
              case "R": clip.setMicrosecondPosition(0);
              break;
              
              default: System.out.println("Not a valid response!");
              
          }
      }
        System.out.println("Bye");
    }




}