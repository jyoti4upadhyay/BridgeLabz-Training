import java.util.Scanner;

public class StudentAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TotalStudent=sc.nextInt();
        int[] age=new int[TotalStudent];
        for(int i=0;i<TotalStudent;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]>=18){
                System.out.println("This Student with age "+age[i]+"can vote");
            }
            else{
                System.out.println("This Student with age "+age[i]+"cannot vote ");
            }
        }
        
    }
    
}
