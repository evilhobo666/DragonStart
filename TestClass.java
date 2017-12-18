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
       int width = 500;
       int height = 500;
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       int R;
       int G; 
       int B;
       Scanner scnr = new Scanner(System.in);
       System.out.println("Type in RGB Numbers");
       R = scnr.nextInt();
       G = scnr.nextInt();
       B = scnr.nextInt();
       Font myFont = new Font("ComicSans", Font.PLAIN, 12);
       
       
       Scene main = new Scene();
       main.drawScene(g);
       
       Dragon Balerion = new Dragon();
       Balerion.dragonSpeech(g);
       Balerion.dragonElement(g);
       Balerion.drawDragon(g);
       
       
       System.out.println(Balerion);
       
       Dragon David = new Dragon(250, 250, 2, R, G, B, "Water", "Hello There!");
       David.dragonSpeech(g);
       David.dragonElement(g);
       David.drawDragon(g);
       
       System.out.println(David);
      
    }
}
