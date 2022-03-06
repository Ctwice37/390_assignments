package assignment_5.prog3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StringSort ss = new StringSort(new StringLengthComparator(true));

		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		ss.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
	}
}
