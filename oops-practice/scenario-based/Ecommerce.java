//product class 
class Product{
    int product_id;
    String product_name;
    double price;
    public Product(int product_id,String product_name,double price){
        this.product_id=product_id;
        this.product_name=product_name;
        this.price=price;
    }
}
//customer class 
class Customer{
    int customerId;
    String customerName;
    Customer(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }
}
//order class 
class Order{
    int orderId;
    Product product;
    Customer customer;
    String status="Created";

    Order(int orderId,Product product,Customer customer){
        this.orderId=orderId;
        this.product=product;
        this.customer=customer;

    }
    void placeOrder(PaymentMode payment) throws Exception{
        payment.pay(product.price);
        status="Placed";
    }
    void cancelOrder(){
        if(status.equals("Placed")){
            status="Cancelled";
            System.out.println("order cancelled");
        }
        else{
            System.out.println("order cannot be cancelled");
        }

    }
}
//Payment Mode
interface PaymentMode{
    void pay(double amount) throws Exception;

}
//card Payment
class CardPayment implements PaymentMode{
    public void pay(double amt)throws Exception{
        if(amt>50000){
            throw new Exception("Payment failed: card limit exceeded");
        }
        System.out.println("Payment of "+amt+" successful");
    }
}
class UpiPayment implements PaymentMode{
    public void pay(double amt){
        System.out.println("Payment Successful");
    }
}
public class Ecommerce{
    public static void main(String[] args) {
        try {
            Product product=new Product(1022,"Chocolate",200);
            Customer customer=new Customer(102,"Jyoti");
            Order order=new Order(89, product, customer);

            PaymentMode payment=new UpiPayment();
            order.placeOrder(payment);
            System.out.println("order status: "+order.status);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
