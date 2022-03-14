package assignment_11.prog1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;


	public Employee() {
		this.salaryRecord = new HashMap();
	}

	public void addEntry(String date, double salary) {
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {

		System.out.println(this.firstName +
				" " + this.lastName + " was paid " +
				salaryRecord.get(date));
		
	}
	public void printAveragePaycheck() {
		Collection c = this.salaryRecord.values();
		double avgAmount = 0.0;
		for(Object d : c) {
			avgAmount = avgAmount + (double) d;
		}

		avgAmount = avgAmount / this.salaryRecord.size();

		System.out.println("Average paycheck for " + this.firstName +
				" " + this.lastName + " was " + avgAmount);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2011");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
