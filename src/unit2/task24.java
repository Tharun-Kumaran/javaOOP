package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

interface Animal {
    void sound();
}
interface Pet extends Animal {
    void play();
}
class Dog implements Pet {
    public void sound() { System.out.println("Dog barks"); }
    public void play() { System.out.println("Dog is playing"); }
}
public class task24 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Dog d=new Dog();
        d.sound();
        d.play();
    }
}
