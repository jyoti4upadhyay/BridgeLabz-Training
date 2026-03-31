class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
class Teacher extends Person{
    String subject;

    public Teacher(String subject, String name, int age) {
        super(name, age);
        this.subject = subject;
    }
    void display(){
        System.out.println(name+" is specialized in "+subject);
    }
    
}
class Student extends Person{
    String grade;
    Student(String name,int age ,String grade){
        super(name, age);
        this.grade=grade;
    }
    void display(){
        System.out.println(name+" got "+grade);
    }
}
class Staff extends Person{
    String department;

    public Staff(String department, String name, int age) {
        super(name, age);
        this.department = department;
    }
    void display(){
        System.out.println(name+"is in "+department+"department");
    }
}
public class SchoolSystem {
    public static void main(String[] args){
        Teacher tc=new Teacher("Math","John",45);
        Student st=new Student("Lily", 10, "A");
        Staff sf=new Staff("Technical","John",45);
        tc.display();
        st.display();
        sf.display();
    }
    
}
