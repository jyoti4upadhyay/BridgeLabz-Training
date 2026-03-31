public class Discount {
    public static void main(String[] args) {
        int fee=125000;
        int discount_percent=10;
        int discount_amt= fee*discount_percent/100;
        int discounted_fee= fee-discount_amt;

        System.out.println("The discount amount is INR " + discount_amt+" and final discounted fee is INR "+discounted_fee);
    }
    
}
