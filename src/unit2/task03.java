package unit2;
import java.util.*;
public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), max=Integer.MIN_VALUE;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int x:a) if(x>max) max=x;
        System.out.println("Largest = "+max);
    }
}