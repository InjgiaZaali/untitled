abstract class Triangle extends AbstractShape {
    private double a;
    private double b;
    private double c;
    private double radius;


    public Triangle(String color, int radius1, int i, double radius) {
        super(color);
        this.radius = radius;

    }
    double getArea(String type) {
        // Using Heron's formula to calculate the area of a triangle
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }


}
