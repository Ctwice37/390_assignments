package assignment_10.prog3;

import java.util.Comparator;

public class Employee {

        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

         class NameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.name.equals(e2.name)) return 0;
                else return e1.name.compareTo(e2.name);
            }
        }

        public boolean equals(Object ob) {
            if (ob == null) return false;
            if (!(ob instanceof Employee)) return false;
            Employee e = (Employee) ob;
            return e.name.equals(name) && e.salary == salary;
        }

    public static void main(String[] args) {
            int result = 7;
        Employee e = new Employee("Charles", 1);
        Employee e1 = new Employee("Charles", 1);

        System.out.println(e.equals(e1));

        result += 11 * result + 1;

        System.out.println(result);
    }
    }

