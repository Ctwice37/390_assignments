package assignment_4.prog1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
    private String name;
    private double Salary;
    private Date hireDate;

    public DeptEmployee(String name, double salary,int aYear, int aMonth, int aDay) {
        this.name = name;
        Salary = salary;
        GregorianCalendar cal = new GregorianCalendar(aYear, aMonth, aDay);
        this.hireDate = cal.getTime();
    }


    public double computeSalary(){
        return this.Salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
