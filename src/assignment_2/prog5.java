package assignment_2;


import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

public class prog5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a string: ");

        String s = sc.next();
        StringWriter r = new StringWriter();

        for(int i = s.length()-1; i >= 0; i--){
                r.append(s.charAt(i));

        }

        System.out.println(r);



    }
}
