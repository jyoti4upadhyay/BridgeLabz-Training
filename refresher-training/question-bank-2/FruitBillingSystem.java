import java.util.*;

class Fruit{
    String name;
    int price ;
    double discount;

    Fruit(String name,int price,double discount){
        this.name=name;
        this.price=price;
        this.discount=discount;
    }
    public String getName(){return name;}
    public int getPrice(){return price;}
    public double getDiscount(){return discount;}

}
class Bill{
    List<Fruit>ls=new ArrayList<>();
    public void addfruits(Fruit fruit){
        ls.add(fruit);
        System.out.println("Added");
    }
    HashMap<String,Integer>hs=new HashMap<>();
    public void addQty(String name,int qty){
        if(hs.containsKey(name)){
            int total=hs.get(name)+qty;
            hs.put(name,total);
            System.out.println(name+" "+hs.get(name));
        }
        else{
            hs.put(name,qty);
            System.out.println(name+" "+hs.get(name));
        }
    }

    public void generateBill(){
        for(String key:hs.keySet()){
            for(int i=0;i<ls.size();i++){
                if(ls.get(i).getName().equals(key)){
                    double bill=hs.get(key)*ls.get(i).getPrice()*(1-(ls.get(i).getDiscount()/100));
                    System.out.println(ls.get(i).getName()+" "+bill);
                }
            }
        }
    }
}
class FruitBillingSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bill bill=new Bill();
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            String[] words=str.split(" ");
            bill.addfruits(new Fruit(words[0],Integer.parseInt(words[1]),Double.parseDouble(words[2])));
        }
        int qtySize=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<qtySize;i++){
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            bill.addQty(arr[0],Integer.parseInt(arr[1]));
            
        }
        bill.generateBill();

    }
}