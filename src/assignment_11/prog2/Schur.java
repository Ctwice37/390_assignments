package assignment_11.prog2;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

public class Schur {

    static boolean checkForSum(List<Integer> list, Integer z){

        HashMap<Integer, Integer> checked = new HashMap<>();

        for(int i = 0; i < list.size(); i++)
            checked.put(list.get(i), list.get(i));

        List<Integer> returned = new ArrayList<Integer>(checked.values());

        for(Integer x : returned){
            if(returned.contains(z - x))
                return true;
        }
        return false;
        }

        public static void main(String[] args) {
        List s = new ArrayList();
        s.add(1);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(1);

        System.out.println(checkForSum(s, 10));
    }
}
