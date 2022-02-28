package assignment_3.prog4;

final class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

//    @Override
//    public String toString() {
//        return "Circle";
//    }
}
