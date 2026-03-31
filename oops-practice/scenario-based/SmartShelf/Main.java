public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook(new Book("Java", "James"));
        shelf.displayShelf();
        shelf.addBook(new Book("Life concepts", "Mavy"));
        shelf.displayShelf();

        shelf.addBook(new Book("Atomic habits", "Mark"));
        shelf.displayShelf();
    }
}