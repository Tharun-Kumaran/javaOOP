package unit2;
import java.util.*;
public class task06 {
    static int[] reverseArray(int[] arr) {
        int[] r=new int[arr.length];
        for(int i=0;i<arr.length;i++) r[i]=arr[arr.length-1-i];
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(Arrays.toString(reverseArray(a)));
    }
}