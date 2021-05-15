package day24;

public class Encspsulation01 {
    public static void main(String[] args) {
        Person person = new Person("waa", 130, 37);
//        person.setName("wang");
//        person.setAge(10);
//        person.setSalary(100);
        System.out.println(person.info());


    }

}

class Person{
    public String name;
    private int age;
    private double salary;
//    public void setName(String name){
//        this.name = name;
//    }
//    public double setSalary(double salary){
//        return salary;
    //快捷键alt + insret
    //按照要求完善代码


    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else{
            System.out.println("名字不对，要2-6个字符");
            this.name = "laowang";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("你设置的年龄不对，给默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为name=" + name + "age=" + age + "薪水=" + salary;
    }
}


