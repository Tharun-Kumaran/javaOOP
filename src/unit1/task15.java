package unit1;

/*Create a class Book with:
• Book ID
• Title
• Author
Create an object and display the book details.*/

class Book {
    // Attributes (Instance Variables)
    private int bookId;
    private String title;
    private String author;

    // Parameterized Constructor to initialize the attributes
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Method to display the book details
    public void displayDetails() {
        System.out.println("--- Book Details ---");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
    }
}
public class task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book(101, "Effective Java", "Joshua Bloch");

        // Display the book details
        myBook.displayDetails();

	}

}
