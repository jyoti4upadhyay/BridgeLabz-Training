public class ShoppingCart {
    static double discount;
    String productName;
    static double price;
    static int quantity;
    final String productId;

    ShoppingCart(String productId,String productName,double price,int quantity,double discount){
        this.productId=productId;
        this.price=price;
        this.productName=productName;
        this.quantity=quantity;
        this .discount=discount;
    }
    static void updateDiscount(){
        double totalPrice=(price*quantity);
        double Discountprice=(discount/100)*price;
        double discountedprice=totalPrice-(Discountprice*quantity);
        System.out.println("Price after Discount:"+discountedprice);

    }
    void display(){
        if(this instanceof ShoppingCart){
            System.out.println("ProductId: "+productId);
            System.out.println("Name: "+productName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount:" +discount);
        }
    }
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart("P001","Laptop",1200.0, 5, 10.0);
        cart.display();
        cart.updateDiscount();
    }
}
