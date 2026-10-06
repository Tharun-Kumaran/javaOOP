package unit2;
import java.util.*;
public class task04 {
    static void findSum(int[] arr) {
        int sum=0;
        for(int x:arr) sum+=x;
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        findSum(a);
    }
}