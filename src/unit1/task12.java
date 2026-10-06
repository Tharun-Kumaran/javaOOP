package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/*Create a class Employee with private variables:
• employeeId
• employeeName
• salary
Use getter and setter methods to display the details.*/

class Employee4{
	private String employeeID;
	private String employeeName;
	private double salary;
	
	public Employee4(String employeeID,String employeeName,double salary) {
		this.employeeID=employeeID;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setEmployeeID(String employeeID) {
		this.employeeID=employeeID;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}


public class task12 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Employee4 e1=new Employee4("01","Ramu",60000);
		System.out.println("Employee ID: "+e1.employeeID+" Employee Name: "+e1.employeeName+" Employee Salary: "+e1.salary);
		e1.setSalary(80000);
		System.out.println("Employee ID: "+e1.employeeID+" Employee Name: "+e1.employeeName+" Employee Salary: "+e1.salary);
		
		
		

	}

}}
