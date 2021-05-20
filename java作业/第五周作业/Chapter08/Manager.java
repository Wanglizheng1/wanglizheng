package 第五周作业.Chapter08;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int day, double daysal, double leval) {
        super(name, day, daysal, leval);
    }

    @Override
    public void printSal() {
        System.out.println("经理" + getName() + " 工资=" + (bonus +
                getDay() * getDaysal() * getLeval()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
