package assignment_4.prog6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
    private double salary;

    PersonWithJob(String n, GregorianCalendar dob, double s) {
        super(n, dob);
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
