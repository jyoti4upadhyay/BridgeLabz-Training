
public class HospitalMangement {
    static int patients=0;
    static String hospitalName ="City Hospital";
    String name,ailment,patientId;
    int age;

    static void getHospitalName(){
        System.out.println(hospitalName);
    }

    HospitalMangement(String name,String ailment,String patientId,int age){
        this.name=name;
        this.ailment=ailment;
        this.patientId=patientId;
        this.age=age;
        patients++;
    }
    

    void display(){
        if(this instanceof HospitalMangement){
            System.out.println("PatientId: "+patientId);
            System.out.println("name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Ailmen: "+ailment);
        }
    }
    static int patientCount(){
        return patients;
    }
    public static void main(String[] args) {

        HospitalMangement hm= new HospitalMangement("Ram","Dengue","P001",31);
        hm.getHospitalName();
        hm.display();
        HospitalMangement.patientCount();
    }

    

}
