import java.util.Scanner;
public class LineComparison {
    //UC1
public double calLength(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter points on x-axis and on y-axis");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    System.out.println("Enter another points on x-axis and y-axis");
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    double diffX=Math.pow((x2-x1),2);
    double diffY=Math.pow((y2-y1),2);
    double length=Math.sqrt(diffX+diffY);
    double res=Double.parseDouble(String.format("%.2f",length));

    System.out.println("length of line is "+res);
    return res;

}
   //UC2
  public void LineEquals(double l1,double l2){
    System.out.println("----------------------------------------");
    if(l1==l2){
        System.out.println("Both lines are Equals");
    }
    else{
        System.out.println("Both lines are not Equals");
    }


}
//UC3
public void compareTwoLines(double l1,double l2){
    System.out.println("----------------------------------------");
    int result=Double.compare(l1,l2);
    if(result>0){
        System.out.println("Line1 is Greater");
    }
    else if(result<0){
        System.out.println("Line2 is Greater");
    }
    else{
        System.out.println("Both are equals");
    }
}











public static void main(String[] args) {
    LineComparison lc=new LineComparison();
    double line1=lc.calLength();
    double line2=lc.calLength();
    lc.LineEquals(line1, line2);
    lc.compareTwoLines(line1, line2);

        
    }
    
}
