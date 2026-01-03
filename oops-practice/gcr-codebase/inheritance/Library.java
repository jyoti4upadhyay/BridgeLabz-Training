
class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int year,String name,String bio){
        super(title,year);
        this.name=name;
        this.bio=bio;
    }
    void displayInfo(){
        System.out.println("Book: "+title+" PublicationYear: "+publicationYear);
        System.out.println("Author: "+name+" Bio: "+bio);


    }


}
public class Library {
    public static void main(String[] args){
        Author  a=new Author("The Mountain",1999,"John L.","poet");
        a.displayInfo(); 
    }
}
