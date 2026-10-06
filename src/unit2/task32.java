package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.io.*;
public class task32 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        String source="source.txt";
        String destination="copy.txt";

        try(FileInputStream in=new FileInputStream(source);
            FileOutputStream out=new FileOutputStream(destination)) {

            int b;
            while((b=in.read())!=-1)
                out.write(b);

            System.out.println("File copied successfully");

        } catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
