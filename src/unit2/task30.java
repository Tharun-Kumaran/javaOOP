package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

abstract class Transaction {
    abstract void processTransaction();
}
public class task30 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Transaction t=new Transaction() {
            void processTransaction() {
                System.out.println("Bank transaction processed");
            }
        };
        t.processTransaction();
    }
}
