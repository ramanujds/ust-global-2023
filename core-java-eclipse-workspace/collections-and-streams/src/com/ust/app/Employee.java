package com.ust.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String city;
}
