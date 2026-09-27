package unit1;
/*Create an object for an Employee class and display:
• Employee ID
• Employee Name
• Salary*/

class Employee5 {
    // Instance variables (Attributes)
    private int employeeId;
    private String employeeName;
    private double salary;

    // Parameterized constructor to initialize the variables
    public Employee5(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Method to display the employee details
    public void displayEmployeeInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary        : $" + salary);
    }
}

public class task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 emp = new Employee5(101, "Alice Smith", 75000.50);

        // Display the details of the created object
        emp.displayEmployeeInfo();
	}

}
