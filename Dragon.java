import java.awt.*;
import java.util.Scanner;
import java.awt.Font;
/**
H-H-H-Here we go!

So they're finally here, performing for you

If you know the words, you can join in too

Put your hands together, if you want to clap

As we take you through this monkey rap

Huh!!

DK! Donkey Kong!!

He's the leader of the bunch, you know him well

He's finally back to kick some tail

His Coconut Gun can fire in spurts

If he shoots ya, it's gonna hurt

He's bigger, faster, and stronger too

He's the first member of the DK crew

Huh!

DK! Donkey Kong!

DK! Donkey Kong is here!

This Kong's got style, so listen up dudes

She can shrink in size, to suit her mood

She's quick and nimble when she needs to be

She can float through the air and climb up trees

If you choose her, you'll not choose wrong

With a skip and a hop, she's one cool Kong

Huh!

DK! Donkey Kong!

He has no style, he has no grace

This Kong has a funny face

He can handstand when he needs to

And stretch his arms out, just for you

Inflate himself just like a balloon

This crazy Kong just digs this tune

Huh!

DK! Donkey Kong!

DK! Donkey Kong is here!

He's back again and about time too

And this time he's in the mood

He can fly real high with his jetpack on

With his pistols out, he's one tough Kong

He'll make you smile when he plays his tune

But Kremlings beware 'cause he's after you

Huh!

DK! Donkey Kong!

Huh!

Finally, he's here for you

It's the last member of the DK crew

This Kong's so strong, it isn't funny

Can make a Kremling cry out for mummy

Can pick up a boulder with relative ease

Makes crushing rocks seem such a breeze

He may move slow, he can't jump high

But this Kong's one hell of a guy

Huh!

C'mon Cranky, take it to the fridge!

Walnuts, peanuts, pineapple smells

Grapes, melons, oranges and coconut shells

Ahh yeah!!
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
    private int R;
    private int G;
    private int B;
    private Color c;
    private String attackType;
    private String dragonText;
    private Font myFont;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        R = 0;
        G = 0;
        B = 0;
        
        attackType = "Fire";
        dragonText = "Hello";
        Font myFont = new Font("TimesRoman", Font.PLAIN, 12);
    }
    
   
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x,int y, int size, int R ,int G, int B, String attackType, String dragonText){
        this.x = x;
        this.y = y;
        this.size = size;
        this.R = R;
        this.G = G;
        this.B = B;
        this.attackType = attackType;
        this.dragonText = dragonText;
        this.myFont = myFont;
    }
     /** Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        Color userColor = new Color(R,G,B);
        g.setColor(userColor); 
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
        g.setFont(new Font("ComicSans", Font.PLAIN, 12)); 
        g.drawString(dragonText, x + 1, y + size - 30);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + R  + G  + B;
    }
}
