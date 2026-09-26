package unit1;
/* Employee Salary
Create an Employee class with:
Employee ID, Employee Name, Salary
Create a method showSalary() and call it using an object.*/

class Employee{
	int employeeID;
	String employeeName;
	String salary;
	
	public Employee(int employeeID,String employeeName,String salary) {
		this.employeeID=employeeID;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	public void showSalary() {
		System.out.println("--Employee Details--");
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Salary: "+salary);
	}
	
}

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(01,"Ram","600000");
		e1.showSalary();
	}

}
