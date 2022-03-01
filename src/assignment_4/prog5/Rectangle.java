package assignment_4.prog5;

public class Rectangle extends ClosedCurve implements Polygon {

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
    public double[] getNumberOfSides() {
        return new double[]{width, width, height, height};
    }

}
