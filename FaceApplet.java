import java.applet.Applet;
import java.awt.*;

public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 30, 200, 200);
        g.fillOval(100, 80, 20, 20);
        g.fillOval(180, 80, 20, 20);
        g.drawLine(155, 100, 145, 140);
        g.drawArc(110, 130, 90, 50, 180, 180);
    }
}