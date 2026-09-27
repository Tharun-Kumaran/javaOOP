package unit1;
/*Create a class Student with:
• Roll Number
• Name
• Static variable college
Create two student objects and display their details.*/
class Student6 {
    // Instance variables (unique to each object)
    int rollNo;
    String name;

    // Static variable (shared among all objects)
    static String college = "RIT";

    // Constructor to initialize instance variables
    public Student6(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("---------------------------");
    }
}

public class task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 student1 = new Student6(101, "Alice");
        Student6 student2 = new Student6(102, "Bob");

        // Displaying details of both students
        System.out.println("--- Student 1 Details ---");
        student1.displayDetails();

        System.out.println("--- Student 2 Details ---");
        student2.displayDetails();
		

	}

}
