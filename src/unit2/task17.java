package unit2;
class Constants {
    static final double PI=3.14159;
    final void display() {
        System.out.println("PI = "+PI);
    }
}
public class task17 {
    public static void main(String[] args) {
        Constants c=new Constants();
        c.display();
        // c.PI=3.14; // ERROR: final variable cannot be reassigned
        // class Test extends Constants {
        //     void display() {} // ERROR: final method cannot be overridden
        // }
    }
}