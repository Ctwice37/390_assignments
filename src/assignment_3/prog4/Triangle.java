package assignment_3.prog4;

final class Triangle extends Shape{

    private final double height;
    private final double base_length;


    public Triangle(double height, double base_length) {
        this.height = height;
        this.base_length = base_length;
    }

    public double computeArea(){
        return (.5 * base_length * height);
    }

    public double getHeight() {
        return height;
    }

    public double getBase_length() {
        return base_length;
    }
}
