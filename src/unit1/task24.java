package unit1;
/*Write a Java program to demonstrate constructor overloading in a Mobile Store
application. Create a Mobile class with three constructors:
● A default constructor
● A constructor that accepts only the mobile brand
● A constructor that accepts both the mobile brand and price
Create objects using all three constructors and display their details.*/

class Mobile4 {
    // Instance variables
    private String brand;
    private double price;

    // 1. Default constructor
    public Mobile4() {
        this.brand = "Unknown Brand";
        this.price = 0.0;
    }

    // 2. Constructor that accepts only the mobile brand
    public Mobile4(String brand) {
        this.brand = brand;
        this.price = 0.0; // Default price when not specified
    }

    // 3. Constructor that accepts both the mobile brand and price
    public Mobile4(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display the details of the mobile object
    public void displayDetails() {
        System.out.println("Mobile Brand: " + brand + " | Price: $" + price);
    }
}

public class task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- Welcome to the Mobile Store --- \n");

        // Creating an object using the default constructor
        Mobile4 mobile1 = new Mobile4();
        
        // Creating an object using the brand-only constructor
        Mobile4 mobile2 = new Mobile4("Apple iPhone");
        
        // Creating an object using the brand and price constructor
        Mobile4 mobile3 = new Mobile4("Samsung Galaxy", 1199.99);

        // Displaying details of all created objects
        System.out.println("Object 1 Details (Default):");
        mobile1.displayDetails();
        
        System.out.println("\nObject 2 Details (Brand Only):");
        mobile2.displayDetails();
        
        System.out.println("\nObject 3 Details (Brand and Price):");
        mobile3.displayDetails();
		

	}

}
