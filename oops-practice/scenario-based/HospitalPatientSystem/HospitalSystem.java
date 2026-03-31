 // package HospitalManagementSystem;

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor(1, "Dr.Jha", "Physician");
        Doctor doc2 = new Doctor(2, "Dr. Mehta", "Orthopedic");

        Patient patient1 = new InPatient(101, "Jyoti", 21, doc1, 5, 2300);
        Patient patient2 = new Discharge(1009, "Mohit", 30, doc2, 800);

        HospitalManagement hospital = new HospitalManagement();

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        System.out.println("\n--- Patient Details ---");
        hospital.displayAllPatients();

        System.out.println("\n--- Bills ---");
        Bill.bill((Payable) patient1);
        Bill.bill((Payable) patient2);

        System.out.println("\n--- Remove Patient ---");
        hospital.removePatient(101);

        System.out.println("\n--- Final List ---");
        hospital.displayAllPatients();
    }
}
