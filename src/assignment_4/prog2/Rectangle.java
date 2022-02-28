package assignment_4.prog2;

public class Rectangle extends ClosedCurve{

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
}
