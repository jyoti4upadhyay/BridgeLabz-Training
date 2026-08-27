import java.util.*;

class Flim{
    String flimName;
    String director;
    int year;

    Flim(String flimName,String director,int year){
        this.flimName=flimName;
        this.director=director;
        this.year=year;
    }
    public String getName(){return flimName;}
    public String getDirector(){return director;}
    public int getYear(){return year;}
}

class FlimLibrary{
    List<Flim>ls=new ArrayList<>();
    public void addFlim(Flim flim){
        ls.add(flim);
        System.out.println("Added");
    }
    public void removeFlim(String flimName){
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getName().equals(flimName)){
                ls.remove(i);
                System.out.println("removed");
            }

        }
    }
    public void display(){
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i).getName()+" "+ls.get(i).getDirector()+" "+ls.get(i).getYear());
        }
    }
    public int count(){
        return ls.size();
    }
}
public class  FlimLibrarySystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlimLibrary flim=new FlimLibrary();
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            String[] word =str.split(" ");
            String operation=word[0];
            
            switch(operation){
                case "ADD":
                    flim.addFlim(new Flim(word[1],word[2]+" "+word[3],Integer.parseInt(word[4])));
                    break;
                case "REMOVE":
                    flim.removeFlim(word[1]);
                    break;
                case "COUNT":
                    System.out.println(flim.count());
                    break;
                case "DISPLAY":
                    flim.display();
                    break;
                default:
                    break;
            }
        }


    }
}
