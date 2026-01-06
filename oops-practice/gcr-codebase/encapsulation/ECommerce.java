import java.util.*;
//Abstract class 
abstract class Product{
    private int productId;
    private String name;
    private double price;

    Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public abstract double calDiscount();
}
//Interface
interface Taxable{
    double calculateTax();
    String getTaxDetails();

}
class Electronics extends Product implements Taxable{
    public Electronics(int productId,String name,double price){
        super(productId,name,price);
    }
    @Override
    public double calDiscount(){
        return  getPrice()*0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice()* 0.18;

    }
    @Override
    public String getTaxDetails(){
        return "18% GST applied";
    }
}
//clothing
class Clothing extends Product implements Taxable{
    public Clothing(int productId,String name,int price){
        super(productId, name, price);
    }
     @Override
    public double calDiscount(){
        return  getPrice()*0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice()* 0.18;

    }
    @Override
    public String getTaxDetails(){
        return "18% GST applied";
    }
}
// Grocery
class Groceries extends Product implements Taxable{
     public Groceries(int productId,String name,int price){
        super(productId, name, price);
    }
     @Override
    public double calDiscount(){
        return  getPrice()*0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice()* 0.18;

    }
    @Override
    public String getTaxDetails(){
        return "18% GST applied";
    }

}
public class ECommerce {
    public static void finalPrice(List<Product> products){
        for(Product p:products){
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " Final Price: " + finalPrice);

        }
    }
    public 
    public static void main(String[] args) {
        List<Product> products =new ArrayList<>();
        products.add(new Electronics(001, "SmartPhone", 23460));
        products.add(new Clothing(789,"Jeans",879));
        products.add(new Groceries(896,"Rice",90));

        finalPrice(products);

    }

}
