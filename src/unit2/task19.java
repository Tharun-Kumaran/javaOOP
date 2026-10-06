package unit2;
import java.util.*;
public class task19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try {
            System.out.println("Result = "+(a/b));
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
    }
}