package assignment_5.prog3;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {

    public static void main(String[] args) {
        StringLengthComparator s = new StringLengthComparator(true);

        String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

        StringSort lambdaSorted = new StringSort((s1,s2) -> s1.length()-s2.length());

        lambdaSorted.stringSort(testStrings);

        System.out.println(Arrays.asList(testStrings));


    }
}
