package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
public class task11 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String clean=s.toLowerCase().replaceAll("\\s+","");
        String rev=new StringBuilder(clean).reverse().toString();
        System.out.println(clean.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
