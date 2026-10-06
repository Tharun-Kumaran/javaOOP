package unit2;
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
        Triangle t=new Triangle();
        t.showShape();
        t.showPolygon();
        t.showTriangle();
    }
}