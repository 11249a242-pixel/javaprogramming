import java.applet.Applet;
import java.awt.*;

public class ColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(30, 30, 120, 70);

        g.setColor(Color.BLUE);
        g.drawOval(180, 30, 120, 70);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString("Java Applets are fun!", 60, 150);
    }
}