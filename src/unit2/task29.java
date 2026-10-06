package unit2;
class Bank2 {
    void openAccount() {
        class Customer {
            void display() {
                System.out.println("Customer account opened successfully");
            }
        }
        Customer c=new Customer();
        c.display();
    }
}
public class task29 {
    public static void main(String[] args) {
        new Bank2().openAccount();
    }
}