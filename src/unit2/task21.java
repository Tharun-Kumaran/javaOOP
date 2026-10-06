package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
class ZeroDivisorException extends Exception {
    ZeroDivisorException(String msg) { super(msg); }
}
public class task21 {
    static int divide(int a,int b) throws ZeroDivisorException {
        if(b==0) throw new ZeroDivisorException("Divisor cannot be zero");
        return a/b;
    }
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try {
            System.out.println("Result = "+divide(a,b));
        } catch(ZeroDivisorException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation complete");
        }
    }
}
