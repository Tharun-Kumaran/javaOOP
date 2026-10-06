package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

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

public class task06 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Student1 s1=new Student1(01,"Ram","CSE");
		s1.displayDetails();

	}

}
