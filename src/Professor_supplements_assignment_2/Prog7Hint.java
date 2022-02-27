package Professor_supplements_assignment_2;

/**
 *  As a hint to Prog9, try running this code and
 *  then examine how it works.
 */
class Prog7Test {
	public static void main(String[] args){
		int num;
		String output = "";
		String output2 = "";
		output = String.format("%16d %12d %n %n %n", 8, 10, 14);
		output += String.format("%13s %2d %9s %2d %n","+", 9, "+", 10);
		output += String.format("%16s %12s","____", "____");

		output2 = String.format("%16d %12d %n %n", 8, 10);
		output2 += String.format("%13s %2d %9s %2d %n","+", 9, "+", 10);
		output2 += String.format("%16s %12s","____", "____");
		System.out.println(output);
		System.out.println("\n\n");
		System.out.println(output2);
	}
}