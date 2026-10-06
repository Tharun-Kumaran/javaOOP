package unit2;
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
        Account a=new Account();
        Account.Transaction t=a.new Transaction();
        t.display();
    }
}