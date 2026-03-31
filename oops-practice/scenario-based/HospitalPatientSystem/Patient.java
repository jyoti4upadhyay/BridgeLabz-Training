public abstract class Patient {
   private int patientId;
   private String name;
   private int age;
   private Doctor doc;

    public Patient(int patientId,String name, int age, Doctor doc) {   
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doc = doc;
    }

    public int getPatientId(){
        return patientId;
    }

     public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doc;
    }

    // polymorphism
    public abstract  void displayInfo();

}