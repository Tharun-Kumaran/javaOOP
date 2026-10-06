package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478


/*Write a Java Program to demonstrate all four access specifiers using two classes in two differen*/


// Helper class within the same package to hold different access levels
class DataHolder {
    // 1. Public: Accessible from anywhere
    public String publicVar = "Public Variable: Accessible everywhere.";

    // 2. Protected: Accessible within the same package and by subclasses
    protected String protectedVar = "Protected Variable: Accessible in same package.";

    // 3. Default (No keyword): Accessible only within the same package
    String defaultVar = "Default Variable: Accessible within the package.";

    // 4. Private: Accessible ONLY inside this class
    private String privateVar = "Private Variable: Restrictive, inside DataHolder only.";

    // Public method to show all variables inside their own class
    public void displayAll() {
        System.out.println("--- Inside DataHolder Class ---");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar); // Fully accessible here
    }

    // Getter method to allow controlled access to the private variable outside
    public String getPrivateVar() {
        return privateVar;
    }
}

public class task18 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// Instantiate the helper class
		DataHolder holder = new DataHolder();
		
		// Display access from within the helper class itself
		holder.displayAll();
		System.out.println();

		// Demonstrate access from a separate class (task18) in the same package
		System.out.println("--- Accessing from task18 Class ---");
		
		// Accessing public, protected, and default variables directly
		System.out.println(holder.publicVar);
		System.out.println(holder.protectedVar);
		System.out.println(holder.defaultVar);
		
		// CRITICAL: Un-commenting the line below will throw a compile-time error
		// System.out.println(holder.privateVar); 
		
		// Accessing the private variable safely using a public getter method
		System.out.println("Indirectly: " + holder.getPrivateVar());
	}

}
