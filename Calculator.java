import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.setLayout(new GridLayout(4, 4));

        String b[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String x : b)
            f.add(new Button(x));

        f.setSize(300, 300);
        f.setVisible(true);
    }
}