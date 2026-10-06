package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/*Create an abstract class Vehicle with:
Abstract Method
start()
Subclasses
• Car
• Bike
Display how each vehicle starts.*/

abstract class Vehicle1 {
    // Abstract method (has no body)
    abstract void start();
}

// Subclass Car extending Vehicle
class Car extends Vehicle1 {
    @Override
    void start() {
        System.out.println("The car starts with a push-button ignition or turn-key.");
    }
}

// Subclass Bike extending Vehicle
class Bike1 extends Vehicle1 {
    @Override
    void start() {
        System.out.println("The bike starts with a kick-start or an electric button.");
    }
}

public class task14 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Vehicle1 myCar = new Car();
        Vehicle1 myBike = new Bike1();

        // Display how each vehicle starts
        myCar.start();
        myBike.start();

	}

}
