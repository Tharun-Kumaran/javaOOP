package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
public class task19 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try {
            System.out.println("Result = "+(a/b));
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
    }
}
