package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
class BookClone implements Cloneable {
    String title;
    ArrayList<String> chapters;

    BookClone(String title,ArrayList<String> chapters) {
        this.title=title;
        this.chapters=chapters;
    }

    public BookClone clone() throws CloneNotSupportedException {
        return (BookClone)super.clone();
    }

    public BookClone deepClone() throws CloneNotSupportedException {
        BookClone b=(BookClone)super.clone();
        b.chapters=new ArrayList<>(chapters);
        return b;
    }
}
public class task26 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<>();
        list.add("Introduction");

        BookClone original=new BookClone("Java",list);

        BookClone shallow=original.clone();
        BookClone deep=original.deepClone();

        shallow.chapters.add("OOP");
        System.out.println("Original after shallow clone: "+original.chapters);

        deep.chapters.add("Exceptions");
        System.out.println("Original after deep clone: "+original.chapters);
        System.out.println("Deep clone: "+deep.chapters);
    }
}
