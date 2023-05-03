package stramapi;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperations {

	public static void main(String[] args) {

		Employee e1 = new Employee(1001, "Mohit", 43000);
		Employee e2 = new Employee(1002, "Harsh", 33000);
		Employee e3 = new Employee(1003, "Pankaj", 53000);
		Employee e4 = new Employee(1004, "Navin", 61000);
		Employee e5 = new Employee(1005, "Javed", 35000);

		List<Employee> emps = List.of(e1, e2, e3, e4, e5);

		// Find all the employees having salary more than 40000

		List<Employee> output = emps.stream().filter(e -> e.getSalary() >= 40000).collect(Collectors.toList());

		output.forEach(e -> System.out.println(e));

		// Increase the salary of employees by 10% where salary is more than 50000

		List<Employee> output2 = emps.stream()
									.filter(e -> e.getSalary() >= 50000)
									.map(e -> {
										e.setSalary(e.getSalary() * 1.1);
										return e;
										})
									.sorted((emp1,emp2)->emp1.getEmployeeName().compareTo(emp2.getEmployeeName()))
									.collect(Collectors.toList());
		
		// Convert all the employee name to uppercase
		
		
//		List<Employee> output3 = emps.stream().map(e->{
//			e.setEmployeeName(e.getEmployeeName().toUpperCase());
//			return e;
//		})
//		.collect(Collectors.toList());
//		
//		System.out.println(output3);
	}
}
