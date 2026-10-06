package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

class Account {
    int accountNumber=101;
    String customerName="Ravi";
    double balance=5000;

    class Transaction {
        void display() {
            System.out.println("Account: "+accountNumber);
            System.out.println("Customer: "+customerName);
            System.out.println("Balance: "+balance);
            System.out.println("Transaction: Deposit");
        }
    }
}
public class task27 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Account a=new Account();
        Account.Transaction t=a.new Transaction();
        t.display();
    }
}
