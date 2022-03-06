package assignment_5.prog3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {
    public static void main(String[] args) {


        String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

        StringSort ss = new StringSort(new StringLengthComparator(true));



        ss.stringSort(testStrings);
        System.out.println(Arrays.asList(testStrings));

    }
}
