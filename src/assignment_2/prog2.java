package assignment_2;



public class prog2 {
   public static void main(String[] args) {


     int x =  Professor_supplements_assignment_2.RandomNumbers.getRandomInt(1,9);
     int y =  Professor_supplements_assignment_2.RandomNumbers.getRandomInt(3,14);


     double firstValue = Math.pow(Math.PI, x);
     double secondValue = Math.pow(y, Math.PI);


     System.out.println("First Value: " + firstValue);
     System.out.println("Second Value: " + secondValue);

   }
}