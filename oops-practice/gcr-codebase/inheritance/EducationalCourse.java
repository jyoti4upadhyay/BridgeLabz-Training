class Course{
    String courseName;
    int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
}
class OnlineCourse extends Course{
    String isRecorded;
    String platform;
    
    OnlineCourse(String courseName,int duration,String isRecorded,String platform){
        super(courseName,duration);
        this.isRecorded=isRecorded;
        this.platform=platform;
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    PaidOnlineCourse(String courseName, int duration, String isRecorded, String platform,int fee,int discount) {
        super(courseName, duration, isRecorded, platform);
        this.fee=fee;
        this.discount=discount;
    }
    void display(){
        System.out.println("Course: "+courseName+" Duration: "+duration+" platform: "+platform+"Recorded: "+isRecorded+" Fee: "+fee+" discount: "+discount);

    }

}
public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse pd=new PaidOnlineCourse("Java Programming",100,"Yes","Zoom"+2000,20, 0);
        pd.display();
    }
    
}
