import java.awt.*;

abstract class AbstractShape implements Shape{
    protected String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);
    public abstract double getArea();

    public String getColor() {

        return color;
    }
    protected Color parseColor(String colorStr) {
        try {
            return new Color(
                    Integer.parseInt(colorStr.substring(1, 3), 16),
                    Integer.parseInt(colorStr.substring(3, 5), 16),
                    Integer.parseInt(colorStr.substring(5, 7), 16)
            );
        } catch (Exception e) {
            return Color.BLACK; // Default color if parsing fails
        }
    }
}