package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

class Parent {
    void display() { System.out.println("Parent"); }
}
class ChildA extends Parent {
    @Override void display() { System.out.println("Child A"); }
}
class ChildB extends Parent {
    @Override void display() { System.out.println("Child B"); }
}
public class task16 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Parent p;
        p=new ChildA();
        p.display();
        p=new ChildB();
        p.display();
    }
}
