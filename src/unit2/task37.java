package unit2;
import java.io.*;

class StudentData implements Serializable {
    String name;
    int rollNo;
    transient String password;

    StudentData(String name,int rollNo,String password) {
        this.name=name;
        this.rollNo=rollNo;
        this.password=password;
    }
}

public class task37 {
    public static void main(String[] args) {
        StudentData s1=new StudentData("Kavya",101,"secret");

        try {
            ObjectOutputStream out=
                new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);
            out.close();

            ObjectInputStream in=
                new ObjectInputStream(new FileInputStream("student.ser"));
            StudentData s2=(StudentData)in.readObject();
            in.close();

            System.out.println("Name: "+s2.name);
            System.out.println("Roll No: "+s2.rollNo);
            System.out.println("Password: "+s2.password);

        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}