import java.util.*;
public class CinemaManger {

     private List<String>movieName=new ArrayList<>();
    private List<String>showTiming=  new ArrayList<>();
    
       //Add Movie
    public void addMovies(String title,String time) throws InvalidTimeFormatException{
        if(! ValidTiming(time)){
            throw new InvalidTimeFormatException("Invalid Time Formar"+time);
        }
        movieName.add(title);
        showTiming.add(time);
        System.out.println("Movie added successfully!");
    }   
     

    //Search Movie

    public void searchMovie(String name) {
        boolean found = false;
        try {
            for (int i = 0; i < movieName.size(); i++) {
                if (movieName.get(i).toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(
                        String.format("Found: %s at %s ", movieName.get(i), showTiming.get(i))
                    );
                    found = true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index while searching.");
        }

        if (!found) {
            System.out.println("No movie found with keyword: " + name);
        }
    }

    //Display movie
    public void displayMovies(){
        if(movieName.isEmpty()){
            System.out.println("No movie available");
            return;
        }
        System.out.println("\n movie shedule");
        for(int i=0;i<movieName.size();i++){
            System.out.println(String.format("%d. %s - %s", i+1,movieName.get(i),showTiming.get(i)));
        }
    }

    //print report
     public void generateReport() {
        String[] nameArray = movieName.toArray(new String[0]);
        String[] timingsArray = showTiming.toArray(new String[0]);

        System.out.println("\n Printable Movie Report:");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i] + " | " + timingsArray[i]);
        }
    }


     private boolean ValidTiming(String time) {
        try {
            String[] time_arr = time.split(":");
            int hour = Integer.parseInt(time_arr[0]);
            int minute = Integer.parseInt(time_arr[1]);

            return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        CinemaManger manager= new CinemaManger();

        try{
            manager.addMovies("Jab We Meet", "19:20");
            manager.addMovies("HouseFull", "13:30");
            manager.addMovies("Golmaal","23:20"); 
            manager.addMovies("Batman","25:61");
        }
        catch(InvalidTimeFormatException e){
            System.out.println(e.getMessage());
        }

        manager.displayMovies();

        manager.searchMovie("Jab we");
        manager.searchMovie("Batman");

        manager.generateReport();
    }
    class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}



}