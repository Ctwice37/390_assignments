//package assignment_4.prog6.case3;
//
//import java.util.GregorianCalendar;
//
//public class Person {
//    private String name;
//    private GregorianCalendar dateOfBirth;
//
//    Person(String name, GregorianCalendar dob) {
//        this.name = name;
//        dateOfBirth = dob;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public GregorianCalendar getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null) return false;
//        if(obj.getClass() != getClass()) return false;
//        Person p = (Person) obj;
//        return (p.getName().equals(this.getName()) && p.getDateOfBirth().equals(this.getDateOfBirth()))
//    }
//}
//
//
