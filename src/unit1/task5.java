package unit1;
/*Create a class named Student with the following attributes:
• Roll Number
• Name
• Department
• CGPA
Create a constructor to initialize the values and display the student details using a method.*/

class Student{
	int roolNUmber;
	String name;
	String department;
	float cgpa;
	
	public Student(int roolNUmber,String name,String department,float cgpa) {
		this.roolNUmber=roolNUmber;
		this.name=name;
		this.department=department;
		this.cgpa=cgpa;
	}
	public int printRoolNumber() {
		return roolNUmber;
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
			+ roolNUmber + " " + department + " " + cgpa;
}
}
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(01,"Ram","CSE",9);
		System.out.println(s1);
		

	}

}
