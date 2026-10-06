package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

/**
 * Demonstrates Javadoc comments.
 * @author Tharun
 * @version 1.0
 */
public class task13 {
    /**
     * Adds two integers.
     * @param a first number
     * @param b second number
     * @return sum
     */
    public int add(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        task13 t=new task13();
        System.out.println("Sum = "+t.add(10,20));
    }
}
