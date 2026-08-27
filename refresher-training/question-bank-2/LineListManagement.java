import java.util.*;

class Point{
    private int x;
    private int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}

}
class Line{
    private Point point1; //start
    private Point point2;//end

    public double getLinesLength(Point point1,Point point2){
        double totalX=Math.abs(point2.getX()-point1.getX());
        double totalY=Math.abs(point2.getY()-point1.getY());
        double powX=Math.pow(totalX,2);
        double powY=Math.pow(totalY,2);
        double length=Math.sqrt(powX+powY); 

        return length;
    }
    public int countLines(Point start){
        if(start.getX()==0 && start.getY()==0){
            return 1;
        }
        return 0;
    }
}
public record LineListManagement() {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        List<Double>ls=new ArrayList<>();
        int count=0;
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            Point start=new Point(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
            Point end=new Point(Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
            Line line=new Line();
            ls.add(line.getLinesLength(start,end));

            count=count+line.countLines(start);
        }
        double max=Double.MIN_VALUE;
        for(int i=0;i<ls.size();i++){
            if(max<ls.get(i)){
                max=ls.get(i);
            }
        }
        if(ls.isEmpty()){
            System.out.println("Max Length "+ null);
        }
        else if(max==Double.MIN_VALUE){
            System.out.println("Max Length "+0);
        }
        else{
            System.out.println("Max Length "+max);
        }
        System.out.println(count);
    }
    
}
