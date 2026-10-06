package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.io.*;
public class task35 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        File file=new File("sample.txt");

        try {
            if(file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            System.out.println("Name: "+file.getName());
            System.out.println("Path: "+file.getAbsolutePath());
            System.out.println("Size: "+file.length()+" bytes");

            if(file.delete())
                System.out.println("File deleted");

        } catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
