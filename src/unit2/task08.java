package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
public class task08 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt(),c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        for(int i=0;i<r1;i++) for(int j=0;j<c1;j++) a[i][j]=sc.nextInt();

        int r2=sc.nextInt(),c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        for(int i=0;i<r2;i++) for(int j=0;j<c2;j++) b[i][j]=sc.nextInt();

        if(c1!=r2) { System.out.println("Multiplication not possible"); return; }

        int[][] p=new int[r1][c2];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    p[i][j]+=a[i][k]*b[k][j];

        for(int[] row:p) {
            for(int x:row) System.out.print(x+" ");
            System.out.println();
        }
    }
}
