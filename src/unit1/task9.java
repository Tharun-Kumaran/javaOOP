package unit1;
/*Create an abstract class Employee with an abstract method calculateSalary().
Create:
• Manager
• Developer
Implement the salary calculation and display the salary*/


//Abstract base class
abstract class Employee3 {
 private String name;
 private int id;

 // Constructor
 public Employee3(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 // Abstract method to be implemented by subclasses
 public abstract double calculateSalary();

 // Concrete method to display employee details
 public void displayEmployeeDetails() {
     System.out.println("----------------------------------------");
     System.out.println("Employee ID   : " + id);
     System.out.println("Employee Name : " + name);
     System.out.printf("Calculated Pay: $%.2f%n", calculateSalary());
 }
}

//Subclass Manager extending Employee
class Manager extends Employee3 {
 private double baseSalary;
 private double performanceBonus;

 public Manager(String name, int id, double baseSalary, double performanceBonus) {
     super(name, id);
     this.baseSalary = baseSalary;
     this.performanceBonus = performanceBonus;
 }

 // Implementing the abstract method
 @Override
 public double calculateSalary() {
     // Managers receive a base salary plus a performance bonus
     return baseSalary + performanceBonus;
 }
}

//Subclass Developer extending Employee
class Developer extends Employee3 {
 private double hourlyRate;
 private int hoursWorked;

 public Developer(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 // Implementing the abstract method
 @Override
 public double calculateSalary() {
     // Developers are paid based on hourly rate and hours worked
     return hourlyRate * hoursWorked;
 }
}
public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 manager = new Manager("Alice Johnson", 101, 7500.00, 1500.00);
        Employee3 developer = new Developer("Bob Smith", 102, 55.00, 160);

        // Displaying details and calculated salaries
        System.out.println("### Employee Payroll Breakdown ###");
        manager.displayEmployeeDetails();
        developer.displayEmployeeDetails();

	}

}
