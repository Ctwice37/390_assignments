package assignment_8.prog3;

import java.util.Comparator;
import java.util.Date;

public class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();

		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
			return 0;
		}
	}	


	

