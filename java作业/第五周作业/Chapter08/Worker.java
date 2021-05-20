package 第五周作业.Chapter08;

public class Worker extends Employee{
    public Worker(String name, int day, double daysal, double leval) {
        super(name, day, daysal, leval);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工");
        super.printSal();
    }
}
