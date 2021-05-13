package day21;

public class ConstrucyorDetail {
    public static void main(String[] args) {
        Person1 p1 = new Person1("WAM", 40);
        Person1 p2 = new Person1("WAM");

    }
}

class Person1{
    String name;
    int age;
    public Person1(){

    }
    public Person1(String pName, int pAge){
        System.out.println("构造器1被调用");
        name = pName;
        age = pAge;
    }
//构造器的重载
    public Person1(String pName){
        System.out.println("构造器2被调用");
        name = pName;
    }
}
