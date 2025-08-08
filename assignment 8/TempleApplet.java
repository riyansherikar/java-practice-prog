import java.applet.*;
import java.awt.*;

/*<applet code="TempleApplet.class" width="400", height="300"></applet>*/
public class TempleApplet extends Applet{
    public void paint(Graphics g){
        g.drawRect(100, 200, 200, 100);
        g.drawRect(120, 250, 20, 50);
        g.drawRect(260, 250, 20, 50);

        int xPoint[] = {100,200,300};
        int yPoint[] = {200,100,200};
        g.drawPolygon(xPoint,yPoint,3);
    }
}
