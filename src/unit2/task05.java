package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
public class task05 {
    static void countEvenOdd(int[] arr) {
        int even=0,odd=0;
        for(int x:arr) {
            if(x%2==0) even++;
            else odd++;
        }
        System.out.println("Even = "+even);
        System.out.println("Odd = "+odd);
    }
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        countEvenOdd(a);
    }
}
