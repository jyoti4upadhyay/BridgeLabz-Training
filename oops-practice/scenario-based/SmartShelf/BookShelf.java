import java.util.*;

class BookShelf {
    List<Book> bookls = new ArrayList<>();

    //  Add book in real-time
    public void addBook(Book newBook) {

        int i = bookls.size() - 1;
        bookls.add(newBook); // temporary add at end

        // Shift books that alphabetically greater
        while (i >= 0 &&
                bookls.get(i).title.compareToIgnoreCase(newBook.title) > 0) {

            bookls.set(i + 1, bookls.get(i));
            i--;
        }

        // Insert at correct position
        bookls.set(i + 1, newBook);
    }

    // Display shelf
    public void displayShelf() {
        System.out.println("Smart Shelf:");
        for (Book b : bookls) {
            System.out.println(b.title + " - " + b.author);
        }
        System.out.println();
    }
}