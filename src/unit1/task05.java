package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/*Create a class named Student with the following attributes:
• Roll Number
• Name
• Department
• CGPA
Create a constructor to initialize the values and display the student details using a method.*/

class Student{
	int rollNumber;
	String name;
	String department;
	float cgpa;
	
	public Student(int rollNumber,String name,String department,float cgpa) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.department=department;
		this.cgpa=cgpa;
	}
	public int printRollNumber() {
		return rollNumber;
	}
	public String printName() {
		return name;
	}
	public String printDepartment() {
		return department;
	}
	public float printCgpa() {
		return cgpa;
	}


@Override
public String toString() {
	return "Name is: " + name
			+ "\nAge, Department and CGPA are: "
			+ rollNumber + " " + department + " " + cgpa;
}
}
public class task05 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Student s1= new Student(01,"Ram","CSE",9.0f);
		System.out.println(s1);
		

	}

}
