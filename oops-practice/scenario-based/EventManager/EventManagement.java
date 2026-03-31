public class EventManagement {
    public static void main(String[] args) {
        Ticket[] tic= {
            new Ticket("Concert", 3000),
            new Ticket("Standup", 1500),
            new Ticket("Movie", 900),
            new Ticket("PlayZone",500),
            new Ticket("HauntedHouseRide",1000)
        };

         QuickSort.quickSort(tic, 0, tic.length - 1);

        System.out.println("Cheapest Tickets:");
        printTopCheapest(tic, 3);

        System.out.println("Most Expensive Tickets:");
        printTopExpensive(tic, 3);
    }
    

     static void printTopCheapest(Ticket[] tic,int j){
        for(int i =0;i<j && i<tic.length;i++){
            System.out.println(tic[i].eventName + " Rs." + tic[i].price);
        }
     }

     static void printTopExpensive(Ticket[] tic, int p) {
        for (int i = tic.length - 1; i >= tic.length - p; i--) {
            System.out.println(tic[i].eventName + " - ₹" + tic[i].price);
        }
    }
}
