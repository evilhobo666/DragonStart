import java.awt.*;
/**
 * Write a description of class Scales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scales extends Dragon
{
    // instance variables 
    private Color scaleColor;
    /**
     * Constructor for objects of class ScaledDragon
     */
    public Scales(int x,int y, int size, int R,int G,int B, String attackType, String dragonText)
    {
        // initialise instance variables
        super(x,y,size,R,G,B,attackType, dragonText);
        
    }

    /**
     * drawScales
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void drawScales(Graphics g)
    {
        g.setColor(scaleColor);
        for(int y = super.y(); y < super.y() + super.x+size * 25 - 15; y +=14){
            for(int x = super.getBodyX(); x < super.getBodyX() + super.getBodyWidth() - 15; x += 14){
                g.drawLine(x, y, x+10, y+10);
            }
        }
     
    }
    public void drawDragon(Graphics g){
        super.drawDragon(g);
        drawScales(g);
    }
}

/*hellyah
