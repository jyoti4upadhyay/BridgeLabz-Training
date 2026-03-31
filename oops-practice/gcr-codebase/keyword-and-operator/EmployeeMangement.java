public class EmployeeMangement {
    static String  CompanyName="Tech Solutions Inc.";
    final int id;
    String name,designation;
    static int totalEmployee=0;
   

    EmployeeMangement(int id,String name, String designation) {
        this.id=id;
        this.name = name;
        this.designation = designation;
        totalEmployee++;
    }
    static void displayTotalEmployee(){
        System.out.println("Total Employee "+totalEmployee);
    }
    void display(){
        if(this instanceof EmployeeMangement){
            System.out.println("Company Name: "+CompanyName);
            System.out.println("Employee ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
        }
    }

    public static void main(String[] args) {
        EmployeeMangement em= new EmployeeMangement(101 ,"Thamarai","Software Engineer");
        em.display();
        EmployeeMangement.displayTotalEmployee();
    }
}
