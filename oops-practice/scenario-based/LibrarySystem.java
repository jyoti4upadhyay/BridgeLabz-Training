import java.util.Scanner;
public class LibrarySystem {
    static String[][] books={
        {"Java Programming","James Gosling"},
       {"Pyhton","Mark"},
        {"The Robert House","Tim Wart"},
        {"The Himalayas Face","Yort leo"}
    };
    static boolean[] status={true,false,true,true};

    static void displayBooks(){
        System.out.println("Welcome To Library!!");

        for(int i=0;i<books.length;i++){
            for(int j=0;j<books.length;j++){
                boolean currstatus=status[i];
                System.out.println(books[i][j]);
                if(currstatus==true){
                    System.out.println("Available");
                }
                else {
                    System.out.println("Checked Out");
                }         
            }
        }
    }
//Search book
    public static void searchBook(String searchedBook){
        boolean found=false;
        for(int i=0;i<books.length;i++){
            for(int j=0;j<books.length;j++){
                if(books[i][j].toLowerCase().contains(searchedBook.toLowerCase())){
                    found=true;
                }
            }
        }
        if(found==false){
            System.out.println("Book not Found");

        }

    }
// Updating book status

public static void bookcheckout(int inx){
    if(status[inx]==true){
        status[inx]=false;
        System.out.println("Book is checkedOut successfully");
    }
    else if(status[inx]==false){
        System.out.println("Book is already Checked Out");
    }
    else{
        System.out.println("Invalid Book Number");
    }
}

// Main class 

public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Library Menu");
    System.out.println("1.Display Books");
    System.out.println("2.Search Books");
    System.out.println("3. CheckOut Book");
    System.out.println("Enter Your choice");
    int choice=sc.nextInt();


    switch(choice){
        case 1: 
            displayBooks();
            break;
        case 2:
            System.out.println("Enter Book name");
            String str=sc.nextLine();
            searchBook(str);
            break;
        case 3:
            System.out.println("Enter book number to checkout");
            int ind=sc.nextInt();
            bookcheckout(ind);
            break;
        default:
            System.out.println("You entered the Wrong choice");
    }

}








}
