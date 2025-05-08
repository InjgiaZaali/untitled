import java.awt.Graphics;

interface Shape {
    void draw(Graphics g);
    double getArea();
    void resize(double factor);
}
