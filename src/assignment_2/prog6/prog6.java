package assignment_2.prog6;


import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class prog6 {

    public static String[] removeDups(String[] strings) {

        Set<String> hash_Set = new HashSet<String>();

        for (String s : strings)
            hash_Set.add(s);
        String[] s = new String[hash_Set.size()];
        hash_Set.toArray(s);

        return s;
    }

//    public static void main(String[] args) {
//
//
//        String[] s = {"Hello", "Hello", "Sam", "Sam"};
//
//        String[] ss = removeDups(s);
//
//       for (String x : ss)
//            System.out.println(x);
//
//
//    }

}