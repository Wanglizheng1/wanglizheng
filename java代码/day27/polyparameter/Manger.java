package day27.polyparameter;

public class Manger extends Employee{
    private double bonus;

    public Manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manger(){
        System.out.println("经理" + getName() + " is manging");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
