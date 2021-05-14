package 第三周作业.Chapter07;

public class Honework12 {
    public static void main(String[] args) {
       Cale c1 = new Cale(5, 4);
       double lenth = c1.sum();
       double s = c1.div();
    }
}

class Empolyee{
    String name;
    char gender;
    int age;
    String job;
    double sal;
    public Empolyee(String job, double sal){
        this.job = job;
        this.sal = sal;
    }
    public Empolyee(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Empolyee(String job, double sal,String name, char gender, int age){
        this(name, gender, age);
        this.job = job;
        this.sal = sal;
    }

}