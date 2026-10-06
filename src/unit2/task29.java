package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

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
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        new Bank2().openAccount();
    }
}
