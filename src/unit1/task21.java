package unit1;
/*Write a Java program to implement a Mobile Store using a parameterized constructor. Create
a Mobile class with the attributes brand and price. Accept the values through the constructor and
display the details of two different mobile objects.*/


class Mobile1 {
    String brand;
    double price;

    // Parameterized constructor to initialize brand and price
    Mobile1(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display mobile details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs " + price);
        System.out.println("--------------------------");
    }
}

public class task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Welcome to the Mobile Store ===");
        
        // Creating two different mobile objects using the parameterized constructor
        Mobile1 mobile1 = new Mobile1("Apple", 999.99);
        Mobile1 mobile2 = new Mobile1("Samsung", 799.50);

        // Displaying the details of both mobile objects
        mobile1.displayDetails();
        mobile2.displayDetails();

	}

}
