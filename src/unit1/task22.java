package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/* Write a Java program to implement a user-defined copy constructor in a Mobile Store application.
Create a mobile object with a brand and price, then create another object by copying the first object
using the copy constructor. Display the details of both objects.*/

class Mobile2 {
    private String brand;
    private double price;

    // Parameterized constructor to initialize the first mobile object
    public Mobile2(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // User-defined copy constructor
    // It accepts an object of the same class as a parameter
    public Mobile2(Mobile2 otherMobile) {
        this.brand = otherMobile.brand; // Copying the brand
        this.price = otherMobile.price; // Copying the price
    }

    // Method to display mobile details
    public void displayDetails(String objectLabel) {
        System.out.println(objectLabel + " -> Brand: " + brand + ", Price: $" + price);
    }
}
public class task22 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
        System.out.println("--- Mobile Store Application --- \n");

        // 1. Create the original mobile object using the parameterized constructor
        Mobile2 originalMobile = new Mobile2("Apple iPhone 15", 799.99);

        // 2. Create a duplicate object by passing the original object into the copy constructor
        Mobile2 copiedMobile = new Mobile2(originalMobile);

        // 3. Display the details of both objects to verify they match
        originalMobile.displayDetails("Original Mobile");
        copiedMobile.displayDetails("Copied Mobile  ");

	}

}
