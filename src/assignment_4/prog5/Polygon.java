package assignment_4.prog5;

public interface Polygon {

    public double[] getNumberOfSides();

    default double computePerimeter() {
        return sum(getNumberOfSides());
    }
    static double sum(double[] arr) {
        double amount = 0;
        for(double d : arr)
            amount += d;

        return amount;
    }

}
