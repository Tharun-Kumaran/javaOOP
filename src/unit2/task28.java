package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

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
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Bank.Branch b=new Bank.Branch();
        b.display();
    }
}
