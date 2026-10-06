package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.io.*;
public class task33 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        String file="data.txt";
        int lines=0,words=0,chars=0;

        try(BufferedReader br=new BufferedReader(new FileReader(file))) {
            String line;
            while((line=br.readLine())!=null) {
                lines++;
                chars+=line.length();
                if(!line.trim().isEmpty())
                    words+=line.trim().split("\\s+").length;
            }

            System.out.println("Lines = "+lines);
            System.out.println("Words = "+words);
            System.out.println("Characters = "+chars);

        } catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
