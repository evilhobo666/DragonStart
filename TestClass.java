import java.awt.*;
import java.util.Scanner;
import java.awt.Font;
import java.util.ArrayList;
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
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       
       
       Scene main = new Scene();
       main.drawScene(g);
       
       int num;
       //ask the user how many dragons they want
       do{
           System.out.println("How many dragons do you want to make?");
           num = scnr.nextInt();
           
           
         }
       while(num<=0);
       //create the dragons
       for(int i = 1; i <= num; i++){
           
           Dragon temp = new Dragon(50*i +25, 50*i + 25, 1*i, R + i*10, G + i*5, B + i*7,"Fire", "Hello There!");
           dragons.add(temp);
           
       }
       //Draw the dragons
       for(int i = 0; i < dragons.size(); i++){
           
           dragons.get(i).dragonElement(g);
           dragons.get(i).drawDragon(g);
           dragons.get(i).dragonSpeech(g);
      
       }
       
       
       
      
       /*Dragon Balerion = new Dragon();
       Balerion.dragonElement(g);
       Balerion.drawDragon(g);
       
       
       System.out.println(Balerion);
       
       Dragon David = new Dragon(250, 250, 2, R, G, B, "Water", "Hello There!");
       David.dragonSpeech(g);
       David.dragonElement(g);
       David.drawDragon(g);
       
       System.out.println(David);
      */
    }
}
