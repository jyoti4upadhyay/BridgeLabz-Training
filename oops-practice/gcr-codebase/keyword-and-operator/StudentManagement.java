public class StudentManagement {
    static String uni="Global University";
    static int totalStudent=0;
    String name;
    int rollnum;
    String grade;

    StudentManagement(String name,int rollnum,String grade){
        this.name=name;
        this.rollnum=rollnum;
        this.grade=grade;
        totalStudent++;

    }
    static String getCollegeName(){
        return  uni;
    }

    void displayTotalStudent(){
        System.out.println("Total Students enrolled: "+totalStudent);

    }

    void display(){

        System.out.println("Roll number "+rollnum);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args) {
        StudentManagement std=new StudentManagement("Sharmila",102,"B");
        std.displayTotalStudent();
        std.getCollegeName();
        std.display();
    }
    
}
