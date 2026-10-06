package unit2;
import java.util.*;
public class task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String clean=s.toLowerCase().replaceAll("\\s+","");
        String rev=new StringBuilder(clean).reverse().toString();
        System.out.println(clean.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}