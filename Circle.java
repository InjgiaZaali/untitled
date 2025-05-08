import java.awt.*;

abstract class Circle extends AbstractShape {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }

    double getArea(String type) {
        double area = Math.PI * radius * radius;

        // You can implement type-specific behavior here if needed
        return area;
    }

    public void draw(Graphics g) {
        // Implementation for drawing the circle using Graphics object
        g.setColor(Color.decode(color));
        g.fillOval(0, 0, (int) (2 * radius), (int) (2 * radius));
    }
}