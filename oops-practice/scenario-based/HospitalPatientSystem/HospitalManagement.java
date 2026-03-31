import java.util.*;

class HospitalManagement {
    private List<Patient> patientlist= new ArrayList<>();

    // CREATE
    public void addPatient(Patient patient) {
        patientlist.add(patient);
        System.out.println("Patient added successfully.");
    }

    // READ
    public void displayAllPatients() {
        for (Patient pt : patients) {
            p.displayInfo(); // Polymorphism
        }
    }

    // UPDATE (Change Doctor)
    public void updateDoctor(int patientId, Doctor newDoctor) {
        for (Patient pt : patients) {
            if (pt.getPatientId() == patientId) {
                System.out.println("Doctor updated for patient ID: " + patientId);
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // DELETE
    public void removePatient(int patientId) {
        patients.removeIf(pt -> pt.getPatientId() == patientId);
        System.out.println("Patient removed.");
    }
}