package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.util.*;
class Book {
    String isbn,title;
    Book(String isbn,String title) {
        this.isbn=isbn; this.title=title;
    }
    @Override public String toString() {
        return isbn+" - "+title;
    }
    @Override public boolean equals(Object o) {
        if(this==o) return true;
        if(!(o instanceof Book)) return false;
        return isbn.equals(((Book)o).isbn);
    }
    @Override public int hashCode() {
        return isbn.hashCode();
    }
}
public class task22 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        HashSet<Book> books=new HashSet<>();
        books.add(new Book("111","Java"));
        books.add(new Book("111","Java Programming"));
        books.add(new Book("222","Python"));
        System.out.println(books);
    }
}
