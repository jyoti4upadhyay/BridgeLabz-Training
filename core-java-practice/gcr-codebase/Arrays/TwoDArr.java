import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        System.out.println("Enter columns");
        int columns=sc.nextInt();
        int[][] arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("1D element");
        int[] cp_arr=new int[rows*columns];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                cp_arr[index]=arr[i][j];
                index++;
            }
        }
        for(int i=0;i<cp_arr.length;i++){
            System.out.print(cp_arr[i]+" ");
            
        }


    }
    
}
