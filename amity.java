
import java.util.ArrayList;
import java.util.List;

interface Library {
    void addBook(String book);
    void issueBook(String book);
    void returnBook(String book);
    void showAvailableBooks();
}


class MyLibrary implements Library {
    private List<String> books = new ArrayList<>();

    @Override
    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to library.");
    }

    @Override
    public void issueBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book + " has been issued.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    @Override
    public void returnBook(String book) {
        books.add(book);
        System.out.println(book + " returned to library.");
    }

    @Override
    public void showAvailableBooks() {
        System.out.println("Available Books: " + books);
    }
}
