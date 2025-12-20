import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int num=sc.nextInt();
        int[] age=new int[num];
        int[] height=new int[num];
        for(int i=0;i<num;i++){
            System.err.println("Enter height");
            height[i]=sc.nextInt();
            System.err.println("Enter age");
            age[i]=sc.nextInt();
        }
        int maxheight=height[0];
        int minage=age[0];
        int heightIndex=1;
        int ageIndex=1;
        for(int i=1;i<num;i++){
            if((height[i]>height[heightIndex]) && (age[i]<age[ageIndex])){
                maxheight=height[i];
                minage=age[i];
                heightIndex++;
                ageIndex++;
            }

        }
        System.out.println("the tallest height is "+maxheight +" the youngest age is "+minage);
    }
    
}
