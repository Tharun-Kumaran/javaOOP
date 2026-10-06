package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/*Create methods:
• add()
• subtract()
• multiply()
Display the results using an object.*/

class Calculator {
    // Methods returning the results
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

public class task17 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();

        // Define input numbers
        double num1 = 20.0;
        double num2 = 5.0;

        // Display the results using the object
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));

	}

}
