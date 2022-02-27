package assignment_2;



public class prog8 {

    static int minimum(int[] arrayOfInts) {
        int minVal=arrayOfInts[0];
        for (int arrayOfInt : arrayOfInts) {
            if (minVal > arrayOfInt) {
                minVal = arrayOfInt;
            }
        }
        return minVal;

    }

    public static void main(String[] args) {
        int[] array= {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, -22};
        int minimumValue = minimum(array);
        System.out.print("The minimum value is: "+ minimumValue);


    }
}





