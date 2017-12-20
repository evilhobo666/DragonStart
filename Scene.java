import java.awt.*;
/**
 * Write a description of class Scene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    private Color HC;
    private Color GC;
    private Color SC;
    

    /**
     * Constructor for objects of class Scene
     */
    public Scene()
    {
        // initialise instance variables
        width = 500;
        height = 500;
        HC = Color.CYAN;
        GC = Color.GREEN;
        SC = Color.YELLOW;
    }
    public Scene(int width, int height, Color HC,Color GC, Color SC)
    {
        // initialise instance variables
        this.width = width;
        this.height = height;
        this.HC = HC;
        this.GC = GC;
        this.SC = SC;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawScene(Graphics g)
    {
        // put your code here
        g.setColor(HC);
        g.fillRect(0,0,width,height);
        g.setColor(GC);
        g.fillRect(0,height -200,width,height - 150);        
        g.setColor(SC);
        g.fillOval(width - 100,0,width - 400,height - 400);
    }
}
