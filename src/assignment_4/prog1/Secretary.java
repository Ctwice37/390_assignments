package assignment_4.prog1;


import java.time.LocalDate;

public class Secretary extends DeptEmployee {

    private double overTimeHours;


    public Secretary(String name, double salary, int aYear, int aMonth, int aDay, double overTimeHours) {
        super(name, salary, aYear, aMonth, aDay);
        this.overTimeHours = overTimeHours;
    }


    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }


    @Override
    public double computeSalary() {
        return super.computeSalary() + 12 * this.getOverTimeHours();
    }
}
