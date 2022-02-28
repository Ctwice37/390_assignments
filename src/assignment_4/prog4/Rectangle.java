package assignment_4.prog4;

public class Rectangle extends ClosedCurve implements Polygon{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double computeArea() {
        return width * height;
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double computePerimeter() {
        return 2*width + 2*height;
    }
}
