public class LibraryManagement {
    static String libraryName="Egmore Library";
    final String isbn;
    String author,title;

    LibraryManagement(String author,String title,String isbn){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    
    static String getLibraryName(){
        return libraryName;
    }
    void display(){
        if(this instanceof LibraryManagement){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
        }
    }
    public static void main(String[] args) {
        LibraryManagement book1=new LibraryManagement("Joshua Bloch","Effective Java","978-0134685991");
        book1.display(); 
        System.out.println(LibraryManagement.getLibraryName());
    }
}
