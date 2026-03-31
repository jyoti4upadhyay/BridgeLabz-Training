

public class ArrayOperator {
    public static void main(String[] args){
        int[] arr=null;
        int index=2;
        try {
            arr=new int[] {10,20,40};
            System.out.println("value at index"+ index+" : "+arr[index]);
            
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index !");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
}
