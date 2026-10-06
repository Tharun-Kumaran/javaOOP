package unit2;
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
        task13 t=new task13();
        System.out.println("Sum = "+t.add(10,20));
    }
}