package 第五周作业.Chapter08;

public class Employee {
    private String name;
    private int day;
    private double daysal;
    private double leval ;

    public void printSal(){
        System.out.println(name + " 工资=" + daysal * day * leval);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getDaysal() {
        return daysal;
    }

    public void setDaysal(double daysal) {
        this.daysal = daysal;
    }

    public double getLeval() {
        return leval;
    }

    public void setLeval(double leval) {
        this.leval = leval;
    }

    public Employee(String name, int day, double daysal, double leval) {
        this.name = name;
        this.day = day;
        this.daysal = daysal;
        this.leval = leval;
    }
}
