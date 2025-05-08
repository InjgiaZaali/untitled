import java.awt.*;

abstract class Rectangle extends AbstractShape {
    private double height;
    private double width;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
    double getArea(String type) {
        double area = width * height;
        return area;
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(parseColor(color));
        int x = (int) (width / -2);
        int y = (int) (height / -2);
        g2d.fillRect(x, y, (int) width, (int) height);
    }


}
