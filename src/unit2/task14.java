package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

class Vehicle {
    void start() { System.out.println("Vehicle started"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is driving"); }
}
class SportsCar extends Car {
    void turbo() { System.out.println("Turbo mode activated"); }
}
public class task14 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        SportsCar s=new SportsCar();
        s.start();
        s.drive();
        s.turbo();
    }
}
