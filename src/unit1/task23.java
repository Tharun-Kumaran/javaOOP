package unit1;
/*Write a Java program to demonstrate a no-argument constructor using a Mobile Store application.
Initialize the mobile details inside the constructor and display the details using a member function.*/

class Mobile3 {
    // Instance variables (Mobile details)
    String brand;
    String model;
    double price;
    int ramSize; // in GB

    // No-argument constructor to initialize mobile details
    Mobile3() {
        brand = "Samsung";
        model = "Galaxy S24";
        price = 79999.00;
        ramSize = 8;
    }

    // Member function to display mobile details
    void displayDetails() {
        System.out.println("--- Mobile Store Item Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("RAM: " + ramSize + " GB");
    }
}
public class task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile3 myMobile = new Mobile3();

        // Calling the member function to display the initialized details
        myMobile.displayDetails();

	}

}
