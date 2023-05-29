package com.ust.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1001, "Rohit", 32000, "Bangalore"));
		employees.add(new Employee(1002, "Gaurav", 61000, "Chennai"));
		employees.add(new Employee(1003, "Tushar", 52000, "Bangalore"));
		employees.add(new Employee(1004, "Karan", 24000, "Delhi"));
		employees.add(new Employee(1005, "Shreya", 64000, "Delhi"));
		employees.add(new Employee(1006, "Javed", 35000, "Bangalore"));
		employees.add(new Employee(1007, "Umesh", 71000, "Trivandrum"));
		employees.add(new Employee(1008, "Harshita", 28000, "Bangalore"));

		printEmployeeList(employees);

		// Sorting based on salary

		List<Employee> sortedBySalary = employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).toList();
		System.out.println("After sorting by salary");
		printEmployeeList(sortedBySalary);

		// Sorting based on salary

		List<Employee> sortedByCity = employees.stream()
				.sorted((e1, e2) -> {
					if(e1.getCity().equalsIgnoreCase(e2.getCity())) {
						return e1.getEmployeeName().compareTo(e2.getEmployeeName());
					}
					return e1.getCity().compareTo(e2.getCity());
				}).toList();
				
		System.out.println("After sorting by city");
		printEmployeeList(sortedByCity);
		
		// Getting employees of a particular city
		
		String city = "Bangalore";
		
		List<Employee> emps = employees.stream().filter(e->e.getCity().equalsIgnoreCase(city)).toList();
		
		System.out.println("Employees belong to "+city);
		printEmployeeList(emps);
		
//		Map<String, Integer> cityCount = new HashMap<>();
//		employees.forEach(e->{
//			if(cityCount.containsKey(e.getCity())) {
//				cityCount.put(e.getCity(),cityCount.get(e.getCity())+1);
//			}
//			else {
//				cityCount.put(e.getCity(),1);
//			}
//		});
//		
//		System.out.println();
//		System.out.println("City\tTotal Employees");
//		cityCount.forEach((c,count)->System.out.println(c+"\t"+count));
		
		Map<String, Long> countByCity = employees.stream()
                .collect(Collectors.groupingBy(e->e.getCity(), Collectors.counting()));

		
		countByCity.forEach((c,count)->System.out.println(c+"\t"+count));

	}

	public static void printEmployeeList(List<Employee> list) {
		System.out.printf("%-10s%-20s%-10s%-20s", "ID", "Name", "Salary", "City");
		System.out.println("\n------------------------------------------------");
		list.forEach(e -> System.out.printf("%-10d%-20s%-10.2f%-20s\n", e.getEmployeeId(), e.getEmployeeName(),
				e.getSalary(), e.getCity()));
	}
	
	
	
	

}
