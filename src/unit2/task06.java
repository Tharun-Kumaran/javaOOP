package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
public class task06 {
    static int[] reverseArray(int[] arr) {
        int[] r=new int[arr.length];
        for(int i=0;i<arr.length;i++) r[i]=arr[arr.length-1-i];
        return r;
    }
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(Arrays.toString(reverseArray(a)));
    }
}
