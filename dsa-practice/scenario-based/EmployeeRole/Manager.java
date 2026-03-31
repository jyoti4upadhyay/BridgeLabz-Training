class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calBonus() {
        return getSalary() * 0.15;
    }
}