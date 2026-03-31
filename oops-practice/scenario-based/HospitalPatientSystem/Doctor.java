public class Doctor {
    private int docId;
    private String docName;
    private String specialization;

    public Doctor(int docId, String docName, String specialization) {
        this.docId = docId;
        this.docName = docName;
        this.specialization = specialization;
    }

    public String getName() {
        return docName;
    }
}
