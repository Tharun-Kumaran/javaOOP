package unit1;
//Define the abstract class Animal
abstract class Animal {
 // Abstract method (does not have a body)
 public abstract void sound();
}

//Dog subclass extending Animal
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Bark");
 }
}

//Cat subclass extending Animal
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Meow");
 }
}
public class task10 {
	public static void main(String[] args) {
        // Create objects of Dog and Cat using Animal references
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Display the sounds produced by each animal
        System.out.print("Dog says: ");
        myDog.sound();

        System.out.print("Cat says: ");
        myCat.sound();
    }
}
