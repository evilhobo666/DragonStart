import java.awt.*;
import java.util.Scanner;
import java.awt.Font;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(500,500);
       Graphics g = panel.getGraphics();
       int R;
       int G; 
       int B;
       Scanner scnr = new Scanner(System.in);
       System.out.println("Type in RGB Numbers");
       R = scnr.nextInt();
       G = scnr.nextInt();
       B = scnr.nextInt();
       
       
       
       
       Dragon jen = new Dragon();
       jen.dragonSpeech(g);
       jen.dragonElement(g);
       jen.drawDragon(g);
       
       
       System.out.println(jen);
       
       Dragon David = new Dragon(250, 250, 2, R, G, B, "Water", "Hello There!");
       David.dragonSpeech(g);
       David.dragonElement(g);
       David.drawDragon(g);
       
       System.out.println(David);
      
    }
}
