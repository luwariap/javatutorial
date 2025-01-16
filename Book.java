public class Book {
    static int totalNoofBooks;
    static String isbn;
    String title;
    String author;
    boolean isBorrowed;

    static {
        totalNoofBooks = 0;
    }

    {
        totalNoofBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this.isbn = isbn;
        this.title = "unknown";
        this.author = "unknown";
    }

    static int getTotalNoofBooks() {
        return totalNoofBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book alreay is  borrowed");
        } else {
            isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnedBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("hope you enjoyed  the book, pl leave  a  review ");
        } else {
            System.out.println("this  book is  already in the  library");
        }

    }

    public static void main(String[] args) {
        Book designOfThings = new Book(isbn ="1");
        {
            designOfThings.title = "design";
            designOfThings.author = "Dr RS Agrawal";
        }
        Book techReading = new Book(isbn="2");{
            techReading.title="New Technology";
            techReading.author="unknown";
        }
        System.out.println(Book.getTotalNoofBooks());
        designOfThings.borrowBook();
        techReading.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnedBook();
        designOfThings.returnedBook();
    }
}