//package assignment_4.prog6.case3;
//
//import java.util.GregorianCalendar;
//
//public class PersonWithJob extends Person {
//    private double salary;
//    private Person p;
//
//    public PersonWithJob(String n, GregorianCalendar dob, double s) {
//
//        p = new Person(n, dob);
//
//        this.salary = s;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null) return false;
//        if(obj.getClass() != getClass()) return false;
//        PersonWithJob jj = (PersonWithJob) obj;
//        return (jj.p.equals(p) && p.salary == salary);
//    }
//}
