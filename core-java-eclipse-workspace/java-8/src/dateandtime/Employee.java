package dateandtime;

import java.time.LocalDate;

public class Employee  {

	private long employeeId;
	private String employeeName;
	private double salary;
	private LocalDate hiredate;
	
	public Employee() {
	}
	
	

	public Employee(long employeeId, String employeeName, double salary, LocalDate hiredate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.hiredate = hiredate;
	}



	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
//	
//	@Override
//	public int compareTo(Employee e) {
//		return (int)(employeeId-e.employeeId);
//	}
	
	
	
}
