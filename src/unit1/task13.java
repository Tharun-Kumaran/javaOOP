package unit1;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/*Create:
• Parent Class: Vehicle
• Child Class: Bike
Methods:
• start()
• ride()
Display both methods using inheritance.*/


abstract class Vehicle{
	 void start() {
		 System.out.println("Starting.....");
	 }
	abstract void ride();
}
class Bike extends Vehicle{
	
	@Override
	void ride() {
		System.out.println("Riding.....");
	}
}
public class task13 {

	public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
		// TODO Auto-generated method stub
		Vehicle v1=new Bike();
		v1.start();
		v1.ride();

	}

}
