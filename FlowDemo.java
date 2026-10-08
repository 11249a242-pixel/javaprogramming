import java.awt.*;

public class FlowDemo {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout");
        f.setLayout(new FlowLayout());

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));
        f.add(new Button("Four"));

        f.setSize(300, 150);
        f.setVisible(true);
    }
}