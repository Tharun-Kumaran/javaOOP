package unit2;
abstract class Employee {
    String name;
    Employee(String name) { this.name=name; }
    abstract double calculateSalary();
}
class Manager extends Employee {
    Manager(String name) { super(name); }
    double calculateSalary() { return 75000; }
}
class Developer extends Employee {
    Developer(String name) { super(name); }
    double calculateSalary() { return 60000; }
}
public class task18 {
    public static void main(String[] args) {
        Employee e1=new Manager("Anita");
        Employee e2=new Developer("Karthik");
        System.out.println(e1.name+" Salary: "+e1.calculateSalary());
        System.out.println(e2.name+" Salary: "+e2.calculateSalary());
    }
}