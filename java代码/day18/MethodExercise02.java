package day18;

public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "wang";
        p.age = 100;
        Mytoolss tools = new Mytoolss();
        Person p2 = tools.copyPerson(p);
        //现在p和p2都是Person对象，但是独立且属性相同
        System.out.println("p的属性 age = " + p.age + "\t名字 = " + p.name);
        System.out.println("p2的属性 age = " + p2.age + "\t名字 = " + p2.name);

    }
}

class Person{
    String name;
    int age;
}

class Mytoolss{
    //编写方法的思路
    // 1. 方法的返回类型 Person
    // 2. 方法的名字 copyPerson
    // 3. 方法的形参 (Person p)
    // 4. 方法体, 创建一个新对象，并复制属性，返回即可
    public Person copyPerson( Person p){
        Person p2 = new Person();
        p2.age = p.age;
        p2.name = p.name;
        return p2;
    }

}
