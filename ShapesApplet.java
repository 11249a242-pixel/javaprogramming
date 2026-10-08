import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(30, 30, 100, 60);       // Rectangle
        g.drawOval(160, 30, 70, 70);       // Circle
        g.drawLine(260, 30, 350, 90);      // Line

        int x[] = {100, 50, 150};
        int y[] = {120, 200, 200};
        g.drawPolygon(x, y, 3);             // Triangle
    }
}
