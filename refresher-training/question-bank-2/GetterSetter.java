import java.util.*;

class Student{
    String name;
    int id;
    int age;
    Student(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public String getName(){return name;}
    public int getId(){return id;}
    public int getAge(){return age;}
}
public class GetterSetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        Student std=new Student(arr[1],Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
        System.out.println("ID:"+std.getId());
        System.out.println("Name:"+std.getName());
        System.out.println("Age:"+std.getAge());
    }
}
