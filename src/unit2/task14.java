package unit2;
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
        SportsCar s=new SportsCar();
        s.start();
        s.drive();
        s.turbo();
    }
}