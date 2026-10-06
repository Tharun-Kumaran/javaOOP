package unit2;
import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] marks=new int[n][m];
        int[] total=new int[n];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++) {
                marks[i][j]=sc.nextInt();
                total[i]+=marks[i][j];
            }

        System.out.println("Marks:");
        for(int[] row:marks) {
            for(int x:row) System.out.print(x+" ");
            System.out.println();
        }

        System.out.println("Totals:");
        for(int x:total) System.out.println(x);

        int highest=0;
        for(int x:total) if(x>highest) highest=x;
        System.out.println("Highest = "+highest);
    }
}