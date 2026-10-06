package unit2;
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
        Dog d=new Dog();
        d.sound();
        d.play();
    }
}