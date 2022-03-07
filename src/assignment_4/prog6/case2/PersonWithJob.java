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
        if(obj == null)
            return false;
        if(obj.getClass() != this.getClass())
            return false;
        PersonWithJob p = (PersonWithJob) obj;
        Double x = p.getSalary();
        Double y = this.getSalary();

        return (p.getName().equals(this.getName()) && p.getDateOfBirth().equals(this.getDateOfBirth()) && x.equals(y)) ;
    }
}
