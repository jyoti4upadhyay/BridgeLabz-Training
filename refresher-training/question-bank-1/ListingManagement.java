import java.util.*;

class RealEstate{
    String propertyId;
    String location;
    double price;
    RealEstate(String propertyId,String location,double price){
        this.propertyId=propertyId;
        this.location=location;
        this.price=price;
    }
    public String getPropertyId(){
        return propertyId;
    } 
    public String getLocation(){
        return location;
    }
    public double getPrice(){
        return price;
    }
}
class PropertyListing{
    List<RealEstate>ls=new ArrayList<>();
    public void  addProperty(RealEstate property){
        ls.add(property);
        System.out.println("Added");
    }
    public void removeProperty(String propertyId){
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getPropertyId().equals(propertyId)){
                ls.remove(ls.get(i));
                System.out.println("Removed");
                return;
            }
        }
        System.out.println("not found");
        
        
    }
    public void updateProperty(RealEstate property){
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getPropertyId().equals(property.getPropertyId())){
                ls.set(i,property);
                System.out.println("Updated");
                return;
            }
        }
        System.out.println("not found");
    }
    public List<RealEstate> filterProperty(String location,double price1,double price2){
        List<RealEstate>list=new ArrayList<>();
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getLocation().equals(location)){
                if(ls.get(i).getPrice()>=price1 && ls.get(i).getPrice()<=price2)
                    list.add(ls.get(i));
            }
        }
        return list;

    }
}

public class ListingManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PropertyListing lib=new PropertyListing();
        while(true){
            String str=sc.nextLine();
            String word[]=str.split(" ");
            String operation=word[0];

            switch(operation){
                case "Add":
                    
                    lib.addProperty(new RealEstate(word[1],word[2],Double.parseDouble(word[3])));
                    break;
                case "Remove":
                    lib.removeProperty(word[1]);
                    break;
                case "Update":
                    lib.updateProperty(new RealEstate(word[1],word[2],Double.parseDouble(word[3])));
                    break;
                case "Filter":
                    double price1=sc.nextDouble();
                    double price2=sc.nextDouble();
                    List<RealEstate>list=lib.filterProperty(word[2],price1,price2);
                    for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i));
                    }
                    break;
                default:
                    break;
            }
        }
    }

}