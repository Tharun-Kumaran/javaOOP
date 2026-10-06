package unit2;
import java.nio.file.*;
import java.io.*;
public class task36 {
    public static void main(String[] args) {
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