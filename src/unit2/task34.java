package unit2;
import java.util.*;
public class task34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int n=sc.nextInt();

        int total=0;
        for(int i=0;i<n;i++)
            total+=sc.nextInt();

        double average=(double)total/n;

        System.out.println("Total = "+total);
        System.out.println("Average = "+average);
    }
}