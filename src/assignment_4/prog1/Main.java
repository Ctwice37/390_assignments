package assignment_4.prog1;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Professor p1 = new Professor("Charles", 200000, 2020, 2, 12, 10);
        Professor p2 = new Professor("Emmie", 500000, 2022, 5, 12, 10);
        Professor p3 = new Professor("Sam", 211000, 2020, 3, 12, 10);
        Secretary s1 = new Secretary("Olivia", 100000, 1986, 6, 12, 200);
        Secretary s2 = new Secretary("Gretchen", 85000, 1999, 3, 12, 200);

        DeptEmployee[] departments = new DeptEmployee[5];

        departments[0] = p1;
        departments[1] = p2;
        departments[2] = p3;
        departments[3] = s1;
        departments[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("See Sum of Salaries? y/n");

        double sal = 0;

        if(sc.nextLine().equalsIgnoreCase("y"));
            for(DeptEmployee d : departments){
                sal+= d.computeSalary();
            }
        System.out.println("Total Amount from all Salaries is: " + sal);

            sc.close();


    }
}
