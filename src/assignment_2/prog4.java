package assignment_2;

import assignment_2.Professor_supplements_assignment_2.Data;


public class prog4 {
   public static void main(String[] args) {


      String s = Data.records;

      String[] entry = s.split(":");

      for (int i = 0; i < entry.length; i++) {
         String[] productID = entry[i].split(",");
         System.out.println(productID[0]);
      }
   }
}