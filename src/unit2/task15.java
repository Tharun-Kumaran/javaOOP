package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

class Shape {
    void showShape() { System.out.println("Shape"); }
}
class Polygon extends Shape {
    void showPolygon() { System.out.println("Polygon"); }
}
class Triangle extends Polygon {
    void showTriangle() { System.out.println("Triangle"); }
}
public class task15 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Triangle t=new Triangle();
        t.showShape();
        t.showPolygon();
        t.showTriangle();
    }
}
