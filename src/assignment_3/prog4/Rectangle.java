package assignment_3.prog4;

final class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
