class Order{
    int orderId;
    String orderDate;

    Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int orderId,String orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    String getOrderStatus(){
        return "Delivered on"+deliveryDate;
    }
    void display(){
        System.out.println("orderId: "+orderId);
        System.out.println("orderDate: "+orderDate);
        System.out.println("TrackingNumber: "+trackingNumber);
    }
} 
public class onlineRetailOrder {
    public static void main(String[] args){
        Deliveredorder do = new Deliveredorder(001,"20-Aug-2025",987,"25-Aug-2025");
        do.display();
        System.out.println("Status: "+do.getOrderStatus();
    }
    
}
