package unit2;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
class NegativeSalaryException extends RuntimeException {
    NegativeSalaryException(String msg) { super(msg); }
}
public class task20 {
    static void checkAge(int age) throws InvalidAgeException {
        if(age<18) throw new InvalidAgeException("Age must be 18 or above");
    }
    static void checkSalary(double salary) {
        if(salary<0) throw new NegativeSalaryException("Salary cannot be negative");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkSalary(-5000);
        } catch(NegativeSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}