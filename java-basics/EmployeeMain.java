class Employee{
	int employeeId;
	String employeeName;
	String email;

	public void printEmployee(){
		System.out.println("ID : "+	employeeId);
		System.out.println("Name : "+employeeName);
		System.out.println("Email : "+email);
	}
}

class EmployeeMain{
	public static void main(String []args){
		Employee e1 = new Employee();
		e1.employeeId = 101;
		e1.employeeName = "Harsh";
		e1.email = "harsh@yahoo.com";
		Employee e2 = new Employee();
		e1.printEmployee();
		e2.printEmployee();
	}
}