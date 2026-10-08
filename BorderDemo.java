import java.awt.*;

public class BorderDemo {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout");

        f.add(new Button("Header"), BorderLayout.NORTH);
        f.add(new Button("Footer"), BorderLayout.SOUTH);
        f.add(new Button("Menu"), BorderLayout.WEST);
        f.add(new Button("Right"), BorderLayout.EAST);
        f.add(new Button("Content"), BorderLayout.CENTER);

        f.setSize(400, 250);
        f.setVisible(true);
    }
}