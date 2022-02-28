package assignment_2;

import assignment_2.Professor_supplements_assignment_2.RandomNumbers;

public class prog7 {
    public static void main(String[] args) {


        String output = "";

        int a = RandomNumbers.getRandomInt(1, 99);
        int b = RandomNumbers.getRandomInt(1, 99);
        int c = RandomNumbers.getRandomInt(1, 99);
        int d = RandomNumbers.getRandomInt(1, 99);
        int e = RandomNumbers.getRandomInt(1, 99);
        int f = RandomNumbers.getRandomInt(1, 99);
        int g = RandomNumbers.getRandomInt(1, 99);
        int h = RandomNumbers.getRandomInt(1, 99);
        int i = RandomNumbers.getRandomInt(1, 99);
        int j = RandomNumbers.getRandomInt(1, 99);

        output = String.format("%16d %10d %10d  %9d %n %n %n %n", a, b, c, d);
        output += String.format("%13s %2d %7s %2d %7s %2d %7s %d %n", "+", e, "+", f, "+", g, "+", h);
        output += String.format("%16s %10s %10s %10s", "____", "____", "____", "____");

        output += "\n\n";
        output += "\n\n";
        output += "\n\n";
        output += String.format("%16d %10d %10d  %9d %n %n %n %n", a, b, c, d);
        output += String.format("%13s %2d %7s %2d %7s %2d %7s %d %n", "+", e, "+", f, "+", g, "+", h);
        output += String.format("%16s %10s %10s %10s", "____", "____", "____", "____");

        System.out.println(output);
    }
}