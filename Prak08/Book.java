public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book One", "Author One", "111111");
        Book book2 = new Book("Book Two", "Author Two", "222222");
        Book book3 = new Book("Book Three", "Author Three", "333333");

        Book.displayTotalBooks(); // Output: Total books: 3
    }
}
