package sortingemployees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeOperations {

	public static void main(String[] args) {

		Employee e1 = new Employee(1001, "Mohit", 43000);
		Employee e2 = new Employee(1005, "Harsh", 33000);
		Employee e3 = new Employee(1004, "Pankaj", 53000);
		Employee e4 = new Employee(1002, "Navin", 61000);
		Employee e5 = new Employee(1003, "Javed", 35000);

//		List<Employee> emps = new ArrayList<>(List.of(e1, e2, e3, e4, e5));
		
//		Comparator<Employee> compareBySalary = 
//				(emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary());
//		
		Comparator<Employee> compareByName = (emp1,emp2)->
				emp1.getEmployeeName().compareTo(emp2.getEmployeeName());	
//				
//		Collections.sort(emps,compareByName);
//		
//		emps.forEach(e->System.out.println(e));
		
		Set<Employee> empSet = new TreeSet<>(compareByName);
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.forEach(e->System.out.println(e));

			
	}
}
