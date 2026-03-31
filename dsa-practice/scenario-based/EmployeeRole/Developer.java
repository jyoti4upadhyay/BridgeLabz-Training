
public class Developer extends Employee {

    public Developer(String name, double salary){
        super(name,salary);
    }

    @Override
    protected double calBonus(){
        return getSalary() > 50000 ? getSalary() * 0.07 : 0.0;
    }
    
}