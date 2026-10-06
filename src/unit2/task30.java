package unit2;
abstract class Transaction {
    abstract void processTransaction();
}
public class task30 {
    public static void main(String[] args) {
        Transaction t=new Transaction() {
            void processTransaction() {
                System.out.println("Bank transaction processed");
            }
        };
        t.processTransaction();
    }
}