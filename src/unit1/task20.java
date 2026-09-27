package unit1;
/*Write a Java program to implement a Mobile Store using a default constructor. Create a Mobile class
with the attributes brand and price. The default constructor should display a welcome message when
a mobile object is created. Display the mobile details after object creation.*/
class Mobile {
    // Attributes
    String brand;
    double price;

    // Default constructor (no-argument constructor)
    Mobile() {
        System.out.println("Welcome to the Mobile Store!");
        brand = "Samsung";
        price = 75000.0;
    }

    // Method to display mobile details
    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: ₹" + price);
    }
}
public class task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
        
        System.out.println("\nDisplaying Mobile Details After Creation:");
        myMobile.displayDetails();

	}

}
