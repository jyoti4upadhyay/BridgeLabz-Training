public class NestedTryCatch {
    public static void main(String[] args){
        int[] arr={9,0,7,5};
        int index=3;
        int divisior=0;



        try {
            try {
                int value=arr[index];
                try {
                    System.out.println("divide: "+(value/divisior));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                }
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index");
            }
            
        } catch (Exception e) {
        System.out.println("Unexpected Error occured");
        }
    }
}