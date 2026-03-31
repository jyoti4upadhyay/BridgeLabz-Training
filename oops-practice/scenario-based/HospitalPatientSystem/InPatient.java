class InPatient extends Patient implements Payable{
    private int admittedDays;
    private double charges;

    public InPatient(int id, String name, int age, Doctor doctor,int admittedDaysdmitted, double charges) {
        super(id, name, age, doctor);
        this.admittedDays =admittedDays;
        this.charges =charges;
    }

    @Override
    public double calculateBill(){
        return admittedDays *charges;
    }

     @Override
    public void displayInfo() {
        System.out.println("In-Patient | ID: " + getPatientId() +
                ", Name: " + getName() +
                ", Doctor: " + getDoctor().getName() +
                ", Bill: ₹" + calculateBill());
    }
}