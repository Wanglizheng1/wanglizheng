package day21;

public class Construcyor01 {
    public static void main(String[] args) {
        Person p1 = new Person("WAM", 40);

    }
}

class Person{
    String name;
    int age;
    public Person(String pName, int pAge){
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }
}
