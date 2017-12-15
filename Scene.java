
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
    private Color horizonColor;
    private Color groundColor;
    private Color sunColor;
    

    /**
     * Constructor for objects of class Scene
     */
    public Scene(int width, int height)
    {
        // initialise instance variables
        this.width = width;
        this.height = height;
        horizonColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.YELLOW;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Scene(int w, int h, Color HC, Color GC, Color SC)
    {
        // put your code here
        Color HorizontalC = new Color(HC);
        g.setColor(HorizontalC);
        g.fillRect(0,0,w,h);
        Color GroundC = new Color(GC);
        g.setColor(GroundC);
        g.fillRect(0,600,w,h);
        Color SunC = new Color(SC);
        g.setColor(SunC);
        g.fillCircle(600,0,w,h);
    }
}
