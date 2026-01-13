import java.util.*;

//Student detail
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}

class Student extends Person{
    private List<String> courses=new ArrayList<>();
    private Map<String ,String> grade=new HashMap<>();
    private int courseLimit=3;
    public Student(String name,int id){
        super(id,name);
    }
    void enrollCourses(String course) throws CourseLimitExceededException{
        if(courses.size()>=courseLimit){
            throw new CourseLimitExceededException("course limit Exceeded");
        }
        courses.add(course);
    }
    void dropCourses(String course){
        courses.remove(course);
    }
    void addGrade(String course,String gradeval){
        grade.put(course,gradeval);
    }
    void viewGrade(){
        System.out.println("Grades: "+grade);
    }
}
//Exception class 
class CourseLimitExceededException extends Exception{
    CourseLimitExceededException(String message){
        super(message);
    }
}

//Registration

interface  Registration{
    void registerStudent(Student student);
}

class RegistrationService implements Registration{
    public void registerStudent(Student student){
        System.out.println("Student Registered");
    }

}

public class CourseRegistration {
    public static void main(String[] args) {
        Student std=new Student("Jyoti",101);
        Registration service=new RegistrationService();

        service.registerStudent(std);

        try{
            std.enrollCourses("Java");
            std.enrollCourses("DSA");
            std.enrollCourses("DBMS"); 
        }
        catch(CourseLimitExceededException e){
            System.out.println(e.getMessage());
        } 
        std.addGrade("DSA","B");
        std.viewGrade();
    }
}
