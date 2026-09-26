package unit1;
/*Create an abstract class Shape with an abstract method area().
Create:
• Rectangle
• Circle
Implement the area() method in both classes and display the area*/

abstract class Shape{
	public abstract double area();
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double area() {
		return length*width;
	}
}
class Circle extends Shape{
	private double r;
	
	public  Circle(double r) {
		this.r=r;
	}
	@Override
	public double area() {
		return Math.PI*r*r;
	}
}

public class task8 {
	public static void main(String[] argss) {
		Shape rectangle1=new Rectangle(1.1,2.2);
		Shape circle1=new Circle(2.0);
		
		System.out.printf("Area of the Rectangle: %.2f\n", rectangle1.area());
        System.out.printf("Area of the Circle: %.2f\n", circle1.area());

		
		
	}
}

