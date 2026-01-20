
public abstract class Employee {
     private final String name;
     private final double salary;
     protected final double bonus;

     public Employee(String name,double salary){
        this.name= name;
        this.salary=salary;
        this.bonus=calBonus();
     }

     protected double getSalary(){
        return salary;
     }

    protected abstract double calBonus();

    public double getBonus() {
        return bonus;
    }
}
