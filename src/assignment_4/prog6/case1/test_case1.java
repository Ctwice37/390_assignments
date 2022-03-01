package assignment_4.prog6.case1;

import java.util.GregorianCalendar;

public class test_case1 {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar(2018, 6, 27);

        PersonWithJob person = new PersonWithJob("Charles", g, 9);
        Person p = new Person("Charles", g);

        System.out.println(p.equals(person));
    }
}
