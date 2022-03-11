package assignment_8.prog3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {

        Date hireDate1 = e1.getHireDate();
        Date hireDate2 = e2.getHireDate();

        if(hireDate1.compareTo(hireDate2) != 0) {
            return hireDate1.compareTo(hireDate2);
        }


            return 0;

    }
}
