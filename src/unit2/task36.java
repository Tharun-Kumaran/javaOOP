package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.nio.file.*;
import java.io.*;
public class task36 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Path source=Paths.get("source.txt");
        Path destination=Paths.get("nio_copy.txt");

        try {
            Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied using NIO");
        } catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
