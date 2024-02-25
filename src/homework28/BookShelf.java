package homework28;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Objects;


public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public void removeBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.title.equals(title)) {
                iterator.remove();
                System.out.println("Книга \"" + title + "\" удалена с полки");
            }
        }
    }

    public static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book book = (Book) obj;
            return year == book.year &&
                    Objects.equals(title, book.title) &&
                    Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, year);
        }
    }



    public void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
        System.out.println("Книга \"" + title + "\" добавлена на полку.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("На полке нет книг.");
        } else {
            System.out.println("Список книг на полке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}