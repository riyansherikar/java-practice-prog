
import java.awt.event.*;
import java.applet.*;
import java.awt.*;


public class SmileyFace extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 50);

        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30); //left eye
        g.fillOval(180, 100, 30, 30); //right eye

        g.drawArc(100, 140, 100, 50, 0, -180);
    }
}