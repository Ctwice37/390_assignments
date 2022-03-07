package assignment_3.prog4;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4);
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 4);


//        Shape[] shapes = new Shape[3];
//        shapes[0] = triangle;
//        shapes[1] = circle;
//        shapes[2] = rectangle;




        System.out.printf("Area of Circle is %.2f\n",circle.computeArea());
        System.out.printf("Area of Triangle is " + triangle.computeArea() + "\n");
        System.out.printf("Area of a Rectangle is " + rectangle.computeArea());
    }
}
