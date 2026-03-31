class Discharge extends Patient implements Payable{

    private double consultationFee;

    public Discharge(int id, String name, int age, Doctor doctor, double fee) {
        super(id, name, age, doctor);
        this.consultationFee = fee;
    }

     @Override
    public double calculateBill() {
        return consultationFee;
    }

     @Override
    public void displayInfo() {
        System.out.println("Out-Patient | ID: " + getPatientId() +
                ", Name: " + getName() +
                ", Doctor: " + getDoctor().getName() +
                ", Bill: ₹" + calculateBill());
    }

}