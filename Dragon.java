import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private String attackType;
    private String textBox;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.BLUE; 
        attackType = "Fire";
        textBox = "Hello";
    }
    
   
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x,int y, int size, Color c, String attackType, String textBox){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; 
        this.attackType = attackType;
        this.textBox = textBox;
    }
     /** Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c); 
        g.fillRect(x, y , size * 25, size * 25); //Draw Head
        g.fillRect(x+size * 25, y + size*25, size *60, size * 50); //Draw Body
        g.fillRect(x+size * 25, (y + size*25) + size * 50, size * 10, size * 30); //Draw Leg #1
        g.fillRect(x+size * 75, (y + size*25) + size * 50, size * 10, size * 30); //Draw Leg #1
        g.fillRect(x+size *85, y + size * 25, size * 30, size * 10); //Draw Tail
       
    }
    private void drawFire(Graphics g)
    {
        g.setColor(Color.RED);
        for(int i = 1; i <= size * 5; i++){
             g.fillOval(x + i * -10, y + size * 10, i * 8, i * 8);
            }
        
    }
    private void drawWater(Graphics g)
    {
       g.setColor(Color.BLUE);
        for(int i = 1; i <= size * 5; i++){
             g.fillOval(x + i * -10, y + size * 15, i * 8, i * 8);
            } 
    }
    public void dragonElement(Graphics g)
    {
        if(attackType.equals("Fire"))
            drawFire(g);
        else if(attackType.equals("Water"))
            drawWater(g);   
    }
    public void dragonSpeech(Graphics g)
    {
        g.drawRect(x, y - 40, size * 35, size * 8);
        g.drawString(textBox, x + 1, y + size - 30);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}
