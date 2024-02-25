package homework28;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();


        bookShelf.addBook("Harry Potter", "J.K. Rowling", 1997);
        bookShelf.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        bookShelf.addBook("To Kill a Mockingbird", "Harper Lee", 1960);


        System.out.println();
        bookShelf.displayBooks();


        bookShelf.removeBook("The Great Gatsby");


        System.out.println();
        bookShelf.displayBooks();
    }
}