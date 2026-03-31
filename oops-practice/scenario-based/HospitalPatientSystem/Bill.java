class Bill {
    public static void bill(Payable patient) {
        System.out.println("Total Bill Amount: " + patient.calculateBill());
    }
}