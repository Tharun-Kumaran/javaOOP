package unit1;
/*Create a Student class with attributes:
Roll Number , Name , Department
Create a method displayDetails() and invoke it using an object*/

class Student1{
	int rollNumber;
	String name;
	String department;
	
	public Student1(int rollNumber,String name,String department) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.department=department;
	}
	public void displayDetails() {
		System.out.println("--Student Details");
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		
	}
	
}

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(01,"Ram","CSE");
		s1.displayDetails();

	}

}
