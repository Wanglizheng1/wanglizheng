package day20;

public class VarScopeDetail {
    public static void main(String[] args) {
        T t1 = new T();
        Person p = new Person();

        t1.test();

        t1.test2(p);
    }
}

class T{
    public void test(){
        Person p1 = new Person();
        System.out.println(p1.name);
    }
    public void test2(Person p1){
        System.out.println(p1.name);
    }
}

class Person {
    String name = "dd";
    private int age = 10;//全局变量可以加修饰符，局部不行

    public void say() {
        String name = "king";//就近原则
        System.out.println(name);
        System.out.println();

    }

    public void hi() {
        String name = "king";//不同方法可以重名
        System.out.println(name);
    }
}