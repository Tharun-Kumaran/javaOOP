package unit2;
class Bank {
    static String bankName="ABC Bank";

    static class Branch {
        void display() {
            System.out.println("Bank: "+bankName);
            System.out.println("Branch: Chennai");
        }
    }
}
public class task28 {
    public static void main(String[] args) {
        Bank.Branch b=new Bank.Branch();
        b.display();
    }
}