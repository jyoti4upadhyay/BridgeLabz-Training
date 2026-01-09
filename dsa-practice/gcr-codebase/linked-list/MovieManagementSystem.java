// Doubly LinkedList
public class MovieManagementSystem {
    static class Node{
        String movieName,director;
        int year;
        double rating;
        Node nextnode,prevnode;
        Node(String movieName,String director,int year,double rating ){
            this.movieName=movieName;
            this.director=director;
            this.year=year;
            this.rating=rating;

        }
    }
    Node headnode,tailnode;

    void addAtBeginning(String name,String dirct,int year,double rating){
        Node newnode=new Node(name, dirct, year, rating);
        newnode.nextnode=headnode;
        if(headnode!=null){
            headnode.prevnode=newnode;
        }
        else{
            tailnode=newnode;
        }
        headnode=newnode;
    }
    void addAtEnd(String name,String dirct,int year,double rating){
        Node newnode=new Node(name, dirct, year, rating);
        if(tailnode==null){
            headnode=tailnode=newnode;
        }
        tailnode.nextnode=newnode;
        newnode.prevnode=tailnode;
        tailnode=newnode;
    }

    void addAtPosition(int pos,String name,String dirct,int year,double rating){
        if(pos==0){
            addAtBeginning(name, dirct, year, rating);
            return;

        }
        Node tempnode=headnode;
        for(int i=1;i<pos && tempnode!=null;i++){
            tempnode=tempnode.nextnode;
        }
        if(tempnode==null){
            return;
        }
        Node newnode=new Node(name, dirct, year, rating);
        newnode.nextnode=tempnode.nextnode;
        if(tempnode.nextnode!=null){
            tempnode.nextnode.prevnode=newnode;
        }
        else headnode=tempnode.nextnode;
        if(tempnode.nextnode!=null){
            tempnode.nextnode.prevnode=tempnode.prevnode;
        }
        else tailnode=tempnode.prevnode;
    }
    void removeByMovieName(String  name){
        Node temp=headnode;
        while(temp!=null && !temp.movieName.equals(name)){
            temp=temp.nextnode;
        }
        if(temp==null){
            return;
        }
        if(temp.prevnode!=null){
            temp.prevnode.nextnode=temp.nextnode;
        }
        else headnode=temp.nextnode;
        if (temp.nextnode != null) temp.nextnode.prevnode = temp.prevnode;
        else tailnode = temp.prevnode;
    }
     void searchByDirector(String director) {
        Node temp = headnode;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Found movie: " + temp.movieName);
                found = true;
            }
            temp = temp.nextnode;
        }
        if (!found) System.out.println("No movies found for director " + director);
    }

    void searchByRating(double rating) {
        Node temp = headnode;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found movie: " + temp.movieName);
                found = true;
            }
            temp = temp.nextnode;
        }
        if (!found) System.out.println("No movies with rating " + rating);
    }

    void displayForward() {
        Node temp = headnode;
        while (temp != null) {
            System.out.println(temp.movieName + ", Dir: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.nextnode;
        }
    }

    void displayReverse() {
        Node temp = tailnode;
        while (temp != null) {
            System.out.println(temp.movieName+ ", Dir: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prevnode;
        }
    }

    void updateRating(String title, double newRating) {
        Node temp = headnode;
        while (temp != null) {
            if (temp.movieName.equals(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + title);
                return;
            }
            temp = temp.nextnode;
        }
        System.out.println("Movie not found.");
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addAtEnd("Inception","Nolan",2010,8.8);
        mms.addAtBeginning("Titanic","Cameron",1997,9.0);
        mms.addAtPosition(1,"Avatar","Cameron",2009,7.9);
        mms.displayForward();
        mms.searchByDirector("Cameron");
        mms.updateRating("Titanic", 9.5);
        mms.removeByMovieName("Avatar");
        mms.displayReverse();
    }
}