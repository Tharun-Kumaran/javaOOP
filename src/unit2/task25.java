package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

interface Vehicle2 {
    void start();
}
interface Car2 extends Vehicle2 {
    void stop();
    void displayDetails();
}
class Honda implements Car2 {
    public void start() { System.out.println("Honda started"); }
    public void stop() { System.out.println("Honda stopped"); }
    public void displayDetails() {
        System.out.println("Brand: Honda");
        System.out.println("Type: Car");
    }
}
public class task25 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Honda h=new Honda();
        h.start();
        h.displayDetails();
        h.stop();
    }
}
