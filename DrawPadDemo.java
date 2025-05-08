import javax.swing.*;
import java.awt.*;

public class DrawPadDemo {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("DrawPad Demo");

        // Create an instance of your custom panel
        DrawPadPanel panel = new DrawPadPanel();

        // Add some shapes to the panel
        panel.addShape(new Circle("red", 50) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public void resize(double factor) {

            }
        });

        panel.addShape(new Rectangle("blue", 100, 60) {
            @Override
            public double getArea() {
                return 0;
            }
        });

        panel.addShape(new Triangle("green", 80, 100, 120) {
            @Override
            public void draw(Graphics g) {

            }

            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public void resize(double factor) {

            }
        });

        // Add panel to the frame
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}